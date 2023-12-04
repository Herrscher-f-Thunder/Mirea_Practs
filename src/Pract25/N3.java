package Pract25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(\\d|[1-9]\\d|1\\d{2}|2([0-4]\\d|5[0-5]))";
        Pattern pattern = Pattern.compile("^" + regex + "\\." +
                regex + "\\." + regex + "\\." + regex + "$");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());
    }
}
/*
127.0.0.1
255.255.255.0
1300.6.7.8
abc.def.gha.bcd
 */
