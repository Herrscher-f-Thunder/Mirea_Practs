    package pract9.N2;
    import pract9.N1.Student;
    import java.util.Arrays;
    import java.util.Collections;

    public class Main {

        public static void main(String[] args) {
            Student[] Students = {new Student(3, "Adamyan", "Arseniy", 272),
                    new Student(1, "Prinz", "Eugen", 301),
                    new Student(2, "GR", "G11", 250)};

            SortingStudentsByGPA sort = new SortingStudentsByGPA();

            sort.quickSort(Students, 0, Students.length - 1);
            System.out.println(Arrays.toString(Students));
        }
    }