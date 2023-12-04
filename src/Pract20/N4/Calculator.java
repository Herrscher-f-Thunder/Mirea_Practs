package Pract20.N4;

public class Calculator {
    public static <N extends Number> Number sum(N a, N b){
        return a.doubleValue() + b.doubleValue();
    }
    public static <N extends Number> Number multiply(N a, N b){
        return a.doubleValue() * b.doubleValue();
    }
    public static <N extends Number> Number divide(N a, N b){
        return a.doubleValue() / b.doubleValue();
    }
    public static <N extends Number> Number subtraction(N a, N b){
        return a.doubleValue() - b.doubleValue();
    }
}
