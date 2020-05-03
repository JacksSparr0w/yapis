package main.handle;

import main.model.Memory;
import main.model.Variable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class MyParser {

    private File outputFile;
    private File functionFile;
    private StringBuilder appender = new StringBuilder();
    public boolean appenderFlag = false;

    public MyParser() {
        outputFile = new File("D:/япис/Compiler/src/main/gen/Output.java");
        functionFile = new File("D:/япис/Compiler/src/main/gen/Functions.java");
        prepareFiles();
    }

    public void write(String s) {
        writeInFile(s, outputFile);
    }

    public void writeVariables(String scope) {
        StringBuilder builder = new StringBuilder();
        LinkedList<Variable> listOfVars = findVarByScope(scope);
        for (Variable var : listOfVars) {
            builder.append("\n" + var.getType() + " "+ var.getName() + " = " + var.getValue() + ";");
        }
        checkFunc(scope, builder.toString());
    }

    public String getMathSign(String typeVar, String sign, String firstVal, String secondVal){
        String math;
        if (typeVar.equals("String")) {
            math = makeMathStr(sign,firstVal, secondVal);
        } else {
            math = makeMathInt(sign) + " " + secondVal;
        }
       return math;
    }

    private String makeMathStr(String sign, String firstVal, String secondVal) {
        String mathSign = new String();
        if (sign.equals("+")){
            mathSign = "+ " + secondVal;
        } else if (sign.equals("-")) {
            mathSign = ".replaceAll("+ firstVal + "," + secondVal + ")";
        }
        return mathSign;
    }

    private String makeMathInt(String sign) {
        return sign;
    }

    private LinkedList findVarByScope(String scope) {
        LinkedList list = new LinkedList();
        HashMap vars = Memory.vars;
        for (Map.Entry<String, Variable> entry :(Set<Map.Entry>) vars.entrySet()) {
            if (entry.getValue().getScope().equals(scope) && !entry.getValue().isAssignment()) {
                list.add(entry.getValue());
                entry.getValue().setAssignment(true);
            }
        }
        return list;
    }

    public void makeRelationHeader(String firstArg, String secondArg, String typeOfRel, String scope) {
        StringBuilder builder = new StringBuilder();
        if (typeOfRel.equals("if")) {
            builder.append("\nif (" + firstArg + ".equals(" + secondArg + ")) {\n");
        } else if (typeOfRel.equals("while")) {
            builder.append("\nwhile (" + firstArg + ".equals(" + secondArg + ")) {\n");
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

    public void makeProcedureHeader(String header, String params) {
        StringBuilder builder = new StringBuilder();
        builder.append("public static void " + header + " (" + params + ") {");
        writeInFile(builder.toString(), functionFile);
    }

    public void closeProcedure() {
        writeInFile("\n}", functionFile);
    }

    public void makeFuncHeader(String header, String params) {
        StringBuilder builder = new StringBuilder();
        builder.append("public static " + header + " (" + params + ") {");
        writeInFile(builder.toString(), functionFile);
    }

    public void closeFunc(String expression){
        writeInFile("return " + expression + ";\n}", functionFile);
    }

    public void makeFuncCall(String name, String params) {
        writeInFile(name + "(" + params + ");", outputFile);
    }

    private void writeInFile(String str, File file) {
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
        if (scope.equals("global") || null == scope) {
            writeInFile(s, outputFile);
        } else {
            writeInFile(s, functionFile);
        }
    }

    public void closeFiles() {
        writeInFile("  }", outputFile);
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

    public void print(String scope, String name) {
        System.out.println(scope);
        checkFunc(scope, "System.out.println(" + name + ");");
    }

}
