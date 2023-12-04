package Pract14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String regex = "abcdefghijklmnopqrstuv18340";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches())
            System.out.print("Совпало");
        else
            System.out.print("НЕ Совпало");
    }
}
