package Pract23.N3;

public class Const implements Expression {
    private double value;
    public Const(double val) {
        value = val;
    }

    public double evaluate(double param) {
        return value;
    }
}