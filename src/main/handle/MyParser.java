package main.handle;

import main.model.Memory;
import main.model.Variable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class MyParser {

    private File outputFile;
    private File functionFile;
    private StringBuilder appender = new StringBuilder();
    public boolean appenderFlag = false;
    private String log = "";

    public MyParser() {
        outputFile = new File("D:/япис/Compiler/src/main/gen/Output.java");
        functionFile = new File("D:/япис/Compiler/src/main/gen/Functions.java");
        prepareFiles();
    }

    public void write(String s) {
        writeInFile(s, outputFile);
    }

    public void writeVariable(String name, String scope) {
        StringBuilder builder = new StringBuilder();
        Memory.vars.get(name).stream()
                .filter(var -> var.getScope().equals(scope) && !var.isAssignment())
                .peek(var -> var.setAssignment(true))
                .forEach(var -> builder.append("\n" + var.getType() + " " + var.getName() + " = " + var.getValue() + ";"));
        checkFunc(scope, builder.toString());
    }

    public String getMathSign(String typeVar, String sign, String firstVal, String secondVal) {
        String math;
        if (typeVar.equals("String")) {
            math = makeMathStr(sign, firstVal, secondVal);
        } else {
            math = makeMathInt(sign) + " " + secondVal;
        }
        return math;
    }

    private String makeMathStr(String sign, String firstVal, String secondVal) {
        String mathSign = new String();
        if (sign.equals("+")) {
            mathSign = "+ " + secondVal;
        } else if (sign.equals("-")) {
            mathSign = ".replaceAll(" + firstVal + "," + secondVal + ")";
        }
        return mathSign;
    }

    private String makeMathInt(String sign) {
        return sign;
    }

    private List<Variable> findVarByScope(String scope) {
        return Memory.vars.entries().stream()
                .map(Map.Entry::getValue)
                .filter(var -> var.getScope().equals(scope) && !var.isAssignment())
                .collect(Collectors.toList());
    }

    private boolean existNameInScope(String scope, String name) {
        return Memory.vars.get(name).stream()
                .anyMatch(var -> var.getScope().equals(scope));
    }

    public void makeRelationHeader(String firstArg, String secondArg, String typeOfRel, String scope) {
        StringBuilder builder = new StringBuilder();
        switch (typeOfRel) {
            case "if":
                builder.append("\nif (" + firstArg + ".equals(" + secondArg + ")) {\n");
                break;
            case "while":
                builder.append("\nwhile (" + firstArg + ".equals(" + secondArg + ")) {\n");
                break;
            case "switch":
                builder.append("\nswitch (" + firstArg + ") {");
                break;
            case "case":
                builder.append("\ncase " + firstArg + ":\n");
                break;
            case "default":
                builder.append("\ndefault: \n");
                break;
            case "endcase":
                builder.append("\nbreak;");
                break;
        }
        checkFunc(scope, builder.toString());
    }

    public void makeRelationBody(String s, String scope) {
        checkFunc(scope, s);
    }

    public void closeRelation(String scope) {
        checkFunc(scope, "}");
    }

    public void makeLoopHeader(String scope) {
        StringBuilder builder = new StringBuilder();
        builder.append("\nfor (");
        checkFunc(scope, builder.toString());
    }

    public void makeLoopHeaderParams(String firstArg, String sign, String secondArg, String thirdArg, String scope) {
        StringBuilder builder = new StringBuilder();
        builder.append(firstArg + " " + sign + " " + secondArg + "; " + thirdArg + ") {");
        checkFunc(scope, builder.toString());
    }

    public void makeProcedureHeader(String header, String params, String scope) {
        createParamsCopyInScope(scope, findNameInParams(params));
        StringBuilder builder = new StringBuilder();
        builder.append("public static void " + header + " (" + params + ") {");
        writeInFile(builder.toString(), functionFile);
    }

    public void closeProcedure(String scope) {
        cleanScope(scope);
        writeInFile("\n}", functionFile);
    }

    public void makeFuncHeader(String header, String params, String scope) {
        createParamsCopyInScope(scope, findNameInParams(params));
        StringBuilder builder = new StringBuilder();
        builder.append("public static " + header + " (" + params + ") {");
        writeInFile(builder.toString(), functionFile);
    }

    public void makeBlockHeader(String scope) {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        writeInFile(builder.toString(), outputFile);
    }

    public void closeBlock(String scope) {
        cleanScope(scope);
        writeInFile("\n}", outputFile);
    }

    public void closeFunc(String expression, String scope) {
        cleanScope(scope);
        writeInFile("return " + expression + ";\n}", functionFile);
    }

    public void makeFuncCall(String name, String params) {
        writeInFile(name + "(" + params + ");", outputFile);
    }

    private void writeInFile(String str, File file) {
        log += str;
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(str + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void prepareFiles() {
        cleanFile(functionFile);
        cleanFile(outputFile);
        writeInFile("package main.gen;\n" +
                "\nimport org.w3c.dom.*;" +
                "import static main.gen.Functions.*;\n\n", outputFile);
        writeInFile("public class Output {", outputFile);
        writeInFile("  public static void main(String[] args) {", outputFile);
        writeInFile("package main.gen;\n\npublic class Functions {", functionFile);
    }

    private void checkFunc(String scope, String s) {
        if ("global".equals(scope) || null == scope || scope.startsWith("block")) {
            writeInFile(s, outputFile);
        } else {
            writeInFile(s, functionFile);
        }
    }

    public void closeFiles() {
        writeInFile("\t}", outputFile);
        writeInFile("}", outputFile);
        writeInFile("}", functionFile);
    }

    private void cleanFile(File file) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkVarNameByScope(String scope, String name) {
        if (!existNameInScope(scope, name)) {
            System.out.println("Error! Nonexisting name: " + name);
        }
    }

    public void print(String scope, String name) {
        checkVarNameByScope(scope, name);
        checkFunc(scope, "System.out.println(" + name + ");");
    }

    private void cleanScope(String scope) {
        List<Variable> vars = Memory.vars.entries().stream()
                .filter(entry ->
                        entry.getValue().getScope().equals(scope)
                ).map(Map.Entry::getValue)
                .collect(Collectors.toList());
        vars.forEach(var -> Memory.vars.remove(var.getName(), var));
    }

    private void createParamsCopyInScope(String scope, List params) {
        List<Variable> newVars = Memory.vars.entries().stream()
                .filter(entry ->
                        params.contains(entry.getValue().getName()))
                .map(Map.Entry::getValue)
                .map(var -> new Variable(var))
                .peek(var -> var.setScope(scope))
                .collect(Collectors.toList());
        newVars.forEach(newVar -> Memory.vars.put(newVar.getName(), newVar));

    }

    private List<String> findNameInParams(String params) {
        List<String> result = new ArrayList<>();
        Arrays.stream(params.split(",")).forEach(param -> result.add(param.split(" ")[1]));
        return result;
    }
}
