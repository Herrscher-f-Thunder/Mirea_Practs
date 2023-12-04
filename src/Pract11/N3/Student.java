package Pract11.N3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Student {

    private String name, surname, specialization, group;
    private int year, gpa;

    private LocalDate birthday;

    public Student(String name, String surname, String specialization, String group, int year, int gpa,
                   LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.group = group;
        this.year = year;
        this.gpa = gpa;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private DateTimeFormatter getDateFormatter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter format of birthday (short, medium, full): ");
        String format = scanner.next();

        return DateTimeFormatter.ofPattern(
                switch (format) {
                    case "short" -> "yy-M-d";
                    case "full" -> "EEEE, MMMM d, yyyy";
                    default -> "yyyy.MM.dd";
                }
        ).localizedBy(Locale.US);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", group='" + group + '\'' +
                ", year=" + year +
                ", gpa=" + gpa +
                ", birthday=" + birthday.format(getDateFormatter()) +
                '}';
    }
}