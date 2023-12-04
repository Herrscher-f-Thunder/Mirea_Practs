package Pract18;
import java.util.Scanner;
public class Exception2 {
    public static void exceptionDemo() {
        Scanner sc = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = sc.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException e) {
            System.out.println("Ошибка. Введите int");
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль!");
        }

    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
