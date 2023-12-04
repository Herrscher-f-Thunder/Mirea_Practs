package Pract23.N3;

public class Variable implements Expression {
    private String name;
    public Variable(String nam) {
        name = nam;
    }

    public double evaluate(double param) {
        return param;
    }
}