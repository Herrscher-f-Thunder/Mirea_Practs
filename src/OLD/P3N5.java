package OLD;

import java.util.Scanner;
public class P3N5 {
    public static void Dollar(double sum){
        double Rub = sum * 97.45;
        double Eur = sum * 0.93;
        double Jpy = sum * 147.78;
        String str = String.format("\n1. %1$,.4f RUB\n2. %3$,.4f EUR\n3. %2$,.4f JPY", Rub, Jpy, Eur);
        System.out.printf("%,.4f USD Можно обменять на: " + str, sum);
    }
    public static void Euro(double sum){
        double Rub = sum * 104.72;
        double Usd = sum * 1.07;
        double Jpy = sum * 158.36;
        String str = String.format("\n1. %1$,.4f RUB\n2. %3$,.4f USD\n3. %2$,.4f JPY", Rub, Jpy, Usd);
        System.out.printf("%,.4f EUR Можно обменять на: " + str, sum);
    }
    public static void Rubble(double sum){
        double Eur = sum * 0.0096;
        double Usd = sum * 0.01;
        double Jpy = sum * 1.51;
        String str = String.format("\n1. %1$,.4f EUR\n2. %3$,.4f USD\n3. %2$,.4f JPY", Eur, Jpy, Usd);
        System.out.printf("%,.4f EUR Можно обменять на: " + str, sum);
    }
    public static void Jpy(double sum){
        double Rub = sum * 0.66;
        double Usd = sum * 0.0068;
        double Eur = sum * 0.0063;
        String str = String.format("\n1. %1$,.4f RUB\n2. %3$,.4f USD\n3. %2$,.4f Eur", Rub, Eur, Usd);
        System.out.printf("%,.4f EUR Можно обменять на: " + str, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Доступная валюта:\n1. USD\n2. EUR\n3. RUB\n4. JPY\nВыберите начальную валюту: ");
        int oper = sc.nextInt();
        System.out.print("Введите начальную сумму: ");
        double sum = sc.nextDouble();
        switch (oper) {
            case 1 -> Dollar(sum);
            case 2 -> Euro(sum);
            case 3 -> Rubble(sum);
            case 4 -> Jpy(sum);
        }
    }
}
