package Pract32;
import java.io.*;
import java.util.ArrayList;

public class ObjectSerializationDemo {
    public static void main(String[] args) {
        try{
            Item item = new Dish(300, "Pizza", "Big");
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Order.ser"));
            outputStream.writeObject(item);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /////////////////////////////////////////////////////////////////////////////
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Order.ser"));
            Item item1 = (Item) inputStream.readObject();
            inputStream.close();
            System.out.println("Order: " + item1.getName());
            System.out.println("Price: " + item1.getCost());
            System.out.println("Description: " + item1.getDescription());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*try {
            Customer customer = new Customer();
            customer.setAge(12);
            customer.setFirstName("Artyom");
            customer.setSecondName("Nalbandyan");
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ArtyomNalbandyan.ser"));

            outputStream.writeObject(customer);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //////////////////////////////////////////////////////////////////////////////////////
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ArtyomNalbandyan.ser"));
            Customer customer = (Customer) inputStream.readObject();
            inputStream.close();
            System.out.println("Age: " + customer.getAge());
            System.out.println("First Name: " + customer.getFirstName());
            System.out.println("Second Name: " + customer.getSecondName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/