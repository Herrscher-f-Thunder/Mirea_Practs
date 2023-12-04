package Pract8;
import java.util.Scanner;
public class N3 {
    public static void recursion(int a, int b){
        if (a == b) {
            System.out.print(a);
            return;
        }
        System.out.print(a + " ");
        if (a < b)
            recursion(a+1, b);
        else recursion(a-1, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Число А: ");
        int a = sc.nextInt();
        System.out.print("Число B: ");
        int b = sc.nextInt();
        recursion(a, b);
    }
}
