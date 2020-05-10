package main.model;

public class Constant<T> {

    private String name;
    private String type;
    private T value;

    public Constant(String name, String type, T value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public T getValue() {
        return value;
    }

    public static void fuuu(){

    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Constant constant = (Constant) o;

        if (name != null ? !name.equals(constant.name) : constant.name != null) return false;
        if (type != null ? !type.equals(constant.type) : constant.type != null) return false;
        if (value != null ? !value.equals(constant.value) : constant.value != null) return false;

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
        return "Constant{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
