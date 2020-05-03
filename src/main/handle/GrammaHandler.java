package main.handle;

import main.model.Constant;
import main.model.Memory;
import main.model.Variable;

import java.util.HashMap;

public class GrammaHandler {

    public String scope = "global";

    public void addVar(Variable variable) {
        Memory.vars.put(variable.getName(), variable);
    }

    public Variable getVar(Variable variable) {
        return Memory.vars.get(variable.getName());
    }

    public Variable getVarByName(String name) {
        return Memory.vars.get(name);
    }

    public static void test() {
        HashMap vars = Memory.vars;
        System.out.println("ok");
    }

    public static void main(String[] args) {
        test();
    }
}
