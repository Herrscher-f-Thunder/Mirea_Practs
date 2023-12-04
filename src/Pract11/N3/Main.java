package Pract11.N3;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Arseniy", "Adamyan", "PrikInf", "INBO-07-22", 2,
                272, LocalDate.now().withYear(2004).withMonth(12).withDayOfMonth(25));

        System.out.println(student);
    }
}