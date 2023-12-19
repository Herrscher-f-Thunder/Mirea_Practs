package Pract31;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input1 = "127.0.0.1";
        String input2 = "255.255.255.0";
        String input3 = "1300.6.7.8";
        String input4 = "abc.def.gha.bcd";

        boolean isValid1 = isValidString(input1);
        boolean isValid2 = isValidString(input2);
        boolean isValid3 = isValidString(input3);
        boolean isValid4 = isValidString(input4);

        System.out.println(input1 + ": " + isValid1);
        System.out.println(input2 + ": " + isValid2);
        System.out.println(input3 + ": " + isValid3);
        System.out.println(input4 + ": " + isValid4);
    }

    public static boolean isValidString(String input) {
        String pattern = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
        return Pattern.matches(pattern, input);
    }
}
