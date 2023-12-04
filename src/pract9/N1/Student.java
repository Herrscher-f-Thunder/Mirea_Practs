package pract9.N1;
public class Student implements Comparable<Student> {
    private final int idNumber;
    private String name, surname;
    private int gpa = 0;

    public Student(int idNumber, String surname, String name) {
        this.idNumber = idNumber;
        this.surname = surname;
        this.name = name;
    }
    public Student(int idNumber, String surname, String name, int gpa) {
        this.idNumber = idNumber;
        this.surname = surname;
        this.name = name;
        this.gpa = gpa;
    }
    public int getGpa() {
        return gpa;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Student other) {
        return Integer.compare(idNumber, other.idNumber);
    }
    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                "}\n";
    }
}