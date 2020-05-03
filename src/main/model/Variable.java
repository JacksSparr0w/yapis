package main.model;

public class Variable<T> {

    private String name;
    private String type;
    private T value;
    private String scope;
    private boolean assignment = false;

    public Variable(String name, String type, String scope) {
        this.name = name;
        this.type = type;
        this.scope = scope;
    }

    public boolean isAssignment() {
        return assignment;
    }

    public void setAssignment(boolean assignment) {
        this.assignment = assignment;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Variable(String name, String type, T value, String scope) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.scope = scope;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Variable variable = (Variable) o;

        if (name != null ? !name.equals(variable.name) : variable.name != null) return false;
        if (type != null ? !type.equals(variable.type) : variable.type != null) return false;
        if (value != null ? !value.equals(variable.value) : variable.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
