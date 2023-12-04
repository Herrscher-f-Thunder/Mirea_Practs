package OLD;

import java.util.Scanner;
public class Matrix {
    Scanner sc = new Scanner(System.in);
    private int[][] Mas;
    private final int lines;
    private final int columns;
    public int getLines() {
        return lines;
    }
    public int getColumns() {
        return columns;
    }
    public Matrix(int lines, int columns){
        Mas = new int[lines][columns];
        this.lines = lines;
        this.columns = columns;
        System.out.println("Введите данные матрицы");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                Mas[i][j] = sc.nextInt();
            }
        }
    }
    public void Sum (Matrix Mas2){
        if (lines != Mas2.getLines() || columns != Mas2.getColumns())
            System.out.println("Ошибка размерности");
        else
            for (int i = 0; i < lines; i++)
                for (int j = 0; j < columns; j++)
                    Mas[i][j] += Mas2.Mas[i][j];
    }
    public void MultiplicationNum (int Num){
        for (int i = 0; i < lines; i++)
            for (int j = 0; j < columns; j++)
                Mas[i][j] *= Num;
    }
    public void MatrixOut (){
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(Mas[i][j]);
                if (j != columns-1)
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
    public void MultiplicationMatrix (Matrix Mas2){
        if (columns != Mas2.getLines())
            System.out.println("Ошибка размерности");
        else {
            int[][] Mas3 = new int[lines][Mas2.columns];
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < Mas2.columns; j++) {
                    for (int k = 0; k < lines; k++)
                        Mas3[i][j] += Mas[i][k] * Mas2.Mas[k][j];
                }
            }
            Mas = Mas3;
        }
    }
}
