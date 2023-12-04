package Pract20.N4;

public class Main {
    public static void main(String[] args) {
        MinMax <Integer> mas = new MinMax<>(new Integer[]{1, 2, 3, 4, 5});
        System.out.println(Calculator.subtraction(mas.FindMax(), mas.FindMin()));
    }
}
