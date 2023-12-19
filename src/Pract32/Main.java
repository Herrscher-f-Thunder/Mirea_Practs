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
    static void printOrders__(ArrayList<TableOrder> tableOrderArrayList, ArrayList<InternetOrder> internetOrderArrayList){
        int i = 0;
        for (; i < tableOrderArrayList.size(); i++){
            System.out.println("***ORDER " +  (i + 1) + " TABLE ORDER***");
            tableOrderArrayList.get(i).print();
        }
        for (int j = 0; j < internetOrderArrayList.size(); j++){
            System.out.println("***ORDER " + (i + 1) + " INTERNET ORDER***");
            internetOrderArrayList.get(j).print();
        }
    }

    public static void main(String[] args) {
        ArrayList<InternetOrder> internetOrders = new ArrayList<>();
        ArrayList<TableOrder> tableOrders = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            printMenu();
            int num = sc.nextInt();
            sc.nextLine();
            InternetOrder internetOrder = new InternetOrder();
            TableOrder tableOrder = new TableOrder();
            if (num == 1) {
                System.out.println("Enter your order");
                //InternetOrder internetOrder = new InternetOrder();
                while (true) {
                    System.out.print("Enter the name of dish/drink. If you have finished your order enter x: ");
                    String name = sc.next();
                    sc.nextLine();
                    if (name.equals("x") || name.equals("X")) break;
                    System.out.println("""
                            Enter the description of your dish/drink
                            1. Small - 300
                            2. Medium - 500
                            3. Big - 700""");
                    double price;
                    String description;
                    int n = sc.nextInt();
                    sc.nextLine();
                    switch(n){
                        case 1-> {
                            price = 300;
                            description = "Small";
                        }
                        case 2->{
                            price = 500;
                            description = "Medium";
                        }
                        case 3->{
                            price = 700;
                            description = "Big";
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
                System.out.println("Enter your order");
                //TableOrder tableOrder = new TableOrder();
                while (true){
                    System.out.print("Enter the name of dish/drink. If you have finished your order enter x: ");
                    String name = sc.next();
                    if (name.equals("x") || name.equals("X")) break;
                    System.out.println("""
                            Enter the description of your dish/drink
                            1. Small - 300
                            2. Medium - 500
                            3. Big - 700""");
                    double price;
                    String description;
                    switch(sc.nextInt()){
                        case 1-> {
                            price = 300;
                            description = "Small";
                        }
                        case 2->{
                            price = 500;
                            description = "Medium";
                        }
                        case 3->{
                            price = 700;
                            description = "Big";
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
                printOrders__(tableOrders, internetOrders);
            }
            else if (num == 4) {
                break;
            }
        }
    }
}