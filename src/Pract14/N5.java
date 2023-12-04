package Pract14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N5 {
    private static boolean isCorrect(String date) {
        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]), month = Integer.parseInt(parts[1]), year = Integer.parseInt(parts[2]);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()).equals(date);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find())
            System.out.print("Приемлимо");
        else
            System.out.print("НЕ Приемлимо");
    }
}
//    29/02/2000
//    30/04/2003

// 30-04-2003
// 29/02/2001