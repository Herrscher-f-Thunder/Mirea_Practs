package OLD;

import java.util.Scanner;
public class ReverseMas {
    public static void main(String[] args) {
        int a = 4;
        String temp;
        Scanner sc = new Scanner(System.in);
        String[] mas = new String[a];
        for (int i = 0; i < a; i++)
            mas[i] = sc.nextLine();
        for (int i = 0; i < a; i++)
            System.out.println(mas[i]);
        for (int i = 0; i < a/2; i++){
            temp = mas[i];
            mas[i] = mas[a-i-1];
            mas[a-i-1] = temp;
        }
        for (int i = 0; i < a; i++)
            System.out.println(mas[i]);
    }
}
