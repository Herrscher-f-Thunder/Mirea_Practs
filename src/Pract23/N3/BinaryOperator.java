package Pract23.N3;

abstract public class BinaryOperator implements Expression {
    protected Expression fOp;
    protected Expression sOp;

    abstract public double evaluate(double param);
}