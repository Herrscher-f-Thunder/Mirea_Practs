package Pract11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class N1 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2023);
        calendar.set(Calendar.MONTH,Calendar.OCTOBER);
        calendar.set(Calendar.DATE,7);
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.MINUTE,52);
        calendar.set(Calendar.SECOND,33);

        System.out.print("Арсений Адамян\nПолучил задание: " +
                dateFormat.format(calendar.getTime()) + "\nВыполнил задание: " +
                dateFormat.format(new Date()));

    }
}
