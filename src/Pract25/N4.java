package Pract25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\([0-9+\\-*/]*\\)");
        Matcher matcher = pattern.matcher(text);
        String res = matcher.replaceAll("");
        System.out.println(!(res.contains("(") || res.contains(")")));
    }
}
/*
(3+5)–9×4
((3+5)–9×4
 */
