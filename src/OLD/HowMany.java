package OLD;

import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        char c;
        int k = 0;
        boolean world = false;
        Scanner sc = new Scanner(System.in);
        while (true){
            c = sc.next().charAt(0);
            if (c == '.') {
                if (world)
                    k++;
                break;
            }
            if (c != ' ')
                world = true;
            if (c == ' ' && world) {
                k++;
                world = false;
            }
        }
        System.out.print("Вы ввели слов: ");
        System.out.print(k);
    }
}
