package Pract23.N3;

public class Subtract extends BinaryOperator implements Expression {
    public Subtract(Expression first, Expression second) {
        fOp = first;
        sOp = second;
    }

    public double evaluate(double param) {
        return fOp.evaluate(param) - sOp.evaluate(param);
    }
}