package pract9.N1;
import java.util.Arrays;

public class Main {
    public static void InsertSort(Student[] list) {
        for (int i = 1; i < list.length; i++){
            Student key = list[i];
            int j = i-1;
            while (j >=0 && list[j].compareTo(key) > 0){
                list [j+1] = list[j];
                j--;
            }
            list[j+1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] Students = {new Student(3, "Adamyan", "Arseniy"),
                new Student(1, "Prinz", "Eugen"),
                new Student(2, "GR", "G11")};

        InsertSort(Students);
        System.out.println(Arrays.toString(Students));
    }
}