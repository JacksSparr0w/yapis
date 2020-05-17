package main.handle;

import main.model.Memory;
import main.model.Variable;

import java.util.Collection;

public class GrammaHandler {

    public String scope = "global";

    public void addVar(Variable variable) {
        Memory.vars.put(variable.getName(), variable);
    }

    public Variable getVar(Variable variable) {
        return findVarByScope(Memory.vars.get(variable.getName()), variable.getName());
    }

    public Variable getVarByName(String name) {
        return findVarByScope(Memory.vars.get(name), name);
    }

    private Variable findVarByScope(Collection<Variable> vars, String name) {
        return vars.stream().filter(var -> var.getScope().equals(scope)).findFirst().orElseGet(null);
    }

    public void checkExistence(String name) {
        if (getVarByName(name) == null) {
            System.out.println("Error! Nonexisting name of variable: " + name);
        }
    }

    public void test() {

    }
}
