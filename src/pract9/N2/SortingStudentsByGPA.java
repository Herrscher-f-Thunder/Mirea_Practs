    package pract9.N2;
    import pract9.N1.Student;
    import java.util.Comparator;

    public class SortingStudentsByGPA implements Comparator<Student> {

        @Override
        public int compare(Student n1, Student n2) {
            return Integer.compare(n1.getGpa(), n2.getGpa());
        }

        public void quickSort(Student[] array, int low, int high) {
            if (array.length == 0)
                return;
            if (low >= high)
                return;

            int middle = low + (high - low) / 2;
            Student opornii = array[middle];

            int i = low, j = high;
            while (i <= j) {
                while (compare(array[i], opornii) > 0)
                    i++;

                while (compare(array[j], opornii) < 0)
                    j--;

                if (i <= j) {
                    Student temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            if (low < j)
                quickSort(array, low, j);

            if (high > i)
                quickSort(array, i, high);
        }
    }