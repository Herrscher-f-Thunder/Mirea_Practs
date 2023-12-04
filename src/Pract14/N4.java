package Pract14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("\\d(?!\\+)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find())
            System.out.print("есть числа без + после");
        else
            System.out.print("НЕТ чисел без + после");
    }
}
