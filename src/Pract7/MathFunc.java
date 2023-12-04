package Pract7;

public class MathFunc implements MathCalculable{
    public double pow(double a, double b){
        return Math.pow(a, b);
    }
    public double complexModul(double a, double b){
        return Math.sqrt(a*a + b*b);
    }

    public double CircleLength(double r){
        return 2 * pi * r;
    }
    public double CircleSquare(double r){
        return pi * pow(r, 2);
    }
}
