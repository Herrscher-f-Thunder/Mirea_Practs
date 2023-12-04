package Pract23.N3;

public class Multiply extends BinaryOperator implements Expression {
    public Multiply(Expression first, Expression second) {
        fOp = first;
        sOp = second;
    }

    public double evaluate(double param) {
        return fOp.evaluate(param) * sOp.evaluate(param);
    }
}