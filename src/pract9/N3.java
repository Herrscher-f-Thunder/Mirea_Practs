package pract9;
import pract9.N1.Student;
import java.util.Arrays;

public class N3 {

    public static void mergeSort(Student[] masRes) {
        if (masRes == null || masRes.length <= 1) {
            return; // Нечего сортировать
        }

        int middle = masRes.length/2;
        Student[] left = new Student[middle];
        Student[] right = new Student[masRes.length - middle];

        // Копируем элементы во временные массивы
        System.arraycopy(masRes, 0, left, 0, middle);
        System.arraycopy(masRes, middle, right, 0, masRes.length - middle);

        // Рекурсивно сортируем левую и правую половины
        mergeSort(left);
        mergeSort(right);

        // Объединяем два отсортированных массива
        merge(masRes, left, right);
    }
    private static void merge(Student[] array, Student[] left, Student[] right) {
        int leftIndex = 0, rightIndex = 0, arrayIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) <= 0) {
                array[arrayIndex++] = left[leftIndex++];
            } else {
                array[arrayIndex++] = right[rightIndex++];
            }
        }

        // Копируем оставшиеся элементы из левого и правого массивов (если они есть)
        while (leftIndex < left.length) {
            array[arrayIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            array[arrayIndex++] = right[rightIndex++];
        }
    }

    public static void main(String[] args) {
        Student[] Students1 = {new Student(6, "Adamyan", "Arseniy", 272),
                new Student(1, "Prinz", "Eugen", 301),
                new Student(2, "GR", "G11", 250)};

        Student[] Students2 = {new Student(4, "Razon", "Vladislav", 299),
                new Student(3, "Raiden", "Mei", 285),
                new Student(5, "Kaslana", "Kiana", 244)};

        Student[] masRes = new Student[Students1.length + Students2.length];
        merge(masRes, Students1, Students2);
        mergeSort(masRes);

        System.out.println(Arrays.toString(masRes));
    }
}