package models;

public class Person {
    private int code;
    private String name;

    public Person(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Código: " + code + ", Nombre: " + name;
    }
}
