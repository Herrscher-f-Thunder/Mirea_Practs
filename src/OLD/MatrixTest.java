package OLD;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix M1 = new Matrix(2, 2);
        Matrix M2 = new Matrix(2, 2);
        M1.Sum(M2);
        M1.MatrixOut();
        M1.MultiplicationNum(2);
        M1.MatrixOut();
        M1.MultiplicationMatrix(M2);
        M1.MatrixOut();
    }
}
