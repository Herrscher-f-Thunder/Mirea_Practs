package OLD;

import  java.util.Scanner;
public class Pitomnik {
    public static void main(String[] args) {
        int a = 3, age;
        String name;
        Scanner sc = new Scanner(System.in);
        Dog[] mas = new Dog[a];
        System.out.println("Введите данные (Имя + Возраст) о " + a + " собак:");
        for (int i = 0; i < a; i++){
           name = sc.nextLine();
           if (i!=0)
               name = sc.nextLine();
           age = sc.nextInt();
           mas[i] = new Dog(name, age);
        }
        System.out.println("Собаки в вашем питомнике:");
        for (int i = 0; i < a; i++){
            System.out.print(i+1);
            System.out.println(mas[i].toString());
        }
    }
}
