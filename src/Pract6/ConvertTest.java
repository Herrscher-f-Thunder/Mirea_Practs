package Pract6;
import java.util.Scanner;
public class ConvertTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        System.out.print("Введите температуру: ");
        temp = sc.nextDouble();
        System.out.print("1. Цельсий\n2. Кельвин\n3. Фаренгейт\nВыберите систему: ");
        int sys;
        sys = sc.nextInt();
        switch (sys){
            case 1:
                Convertable celsius = new Celsius(temp);
                celsius.convert();
                break;
            case 2:
                Convertable kelvin = new Kelvin(temp);
                kelvin.convert();
                break;
            case 3:
                Convertable farengate = new Farengate(temp);
                farengate.convert();
        }
    }
}
