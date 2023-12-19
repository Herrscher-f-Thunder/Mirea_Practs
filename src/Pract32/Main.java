package Pract32;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static void printMenu() {
        System.out.println("""
                Choose an operation
                1 - Internet order
                2 - Table order
                3 - List of orders
                4 - Exit""");
    }
    static void printOrders(ArrayList<TableOrder> tableOrderArrayList, ArrayList<InternetOrder> internetOrderArrayList){
        int i = 0;
        for (; i < tableOrderArrayList.size(); i++){
            System.out.println("/////"+(i + 1) + " Table Order"+"\\\\\\\\\\");
            tableOrderArrayList.get(i).print();
            System.out.println();
        }
        for (int j = 0; j < internetOrderArrayList.size(); j++){
            System.out.println((i + 1) + " Internet Order");
            internetOrderArrayList.get(j).print();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<InternetOrder> internetOrders = new ArrayList<>();
        ArrayList<TableOrder> tableOrders = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            printMenu();
            System.out.print("Command: ");
            int num = sc.nextInt();
            sc.nextLine();
            InternetOrder internetOrder = new InternetOrder();
            TableOrder tableOrder = new TableOrder();
            if (num == 1) {
                System.out.println("Enter your Internet order");
                while (true) {
                    System.out.print("Enter the name of dish/drink. If you have finished your order enter all: ");
                    String name = sc.next();
                    sc.nextLine();
                    if (name.equals("all") || name.equals("All") || name.equals("ALL")) break;
                    System.out.println("""
                            Enter the description of your dish/drink
                            1. Solo - 2$
                            2. Duo - 6$
                            3. Family - 9$""");
                    double price;
                    String description;
                    System.out.print("Description: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    switch(n){
                        case 1-> {
                            price = 2;
                            description = "Solo";
                        }
                        case 2->{
                            price = 6;
                            description = "Duo";
                        }
                        case 3->{
                            price = 9;
                            description = "Family";
                        }
                        default -> {
                            price = 0;
                            description = "no description";
                        }
                    };
                    internetOrder.add(new Dish(price, name, description));
                }
                internetOrders.add(internetOrder);
            }
            if (num == 2){
                System.out.println("Enter your Table order");
                while (true){
                    System.out.print("Enter the name of dish/drink. If you have finished your order enter all: ");
                    String name = sc.next();
                    if (name.equals("all") || name.equals("All") || name.equals("ALL")) break;
                    System.out.println("""
                            Enter the description of your dish/drink
                            1. Solo - 2$
                            2. Duo - 6$
                            3. Family - 9$""");
                    double price;
                    String description;
                    System.out.print("Description: ");
                    switch(sc.nextInt()){
                        case 1-> {
                            price = 3;
                            description = "Solo";
                        }
                        case 2->{
                            price = 5;
                            description = "Duo";
                        }
                        case 3->{
                            price = 8;
                            description = "Family";
                        }
                        default -> {
                            price = 0;
                            description = "no description";
                        }
                    };
                    tableOrder.add(new Dish(price, name, description));
                }
                tableOrders.add(tableOrder);
            }
            else if (num == 3) {
                System.out.println("List of orders");
                printOrders(tableOrders, internetOrders);
            }
            else if (num == 4) {
                break;
            }
        }
    }
}