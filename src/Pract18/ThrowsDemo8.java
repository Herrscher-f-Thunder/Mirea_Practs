package Pract18;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo8 {
    public void getKey() {
        Scanner sc = new Scanner( System.in);
        String key = sc.nextLine();
        try {
            printDetails(key);
        } catch (Exception e){
            getKey();
        }
    }
    public void printDetails(String key) throws Exception{
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch ( Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
    private String getDetails(String key) throws Exception{
        if(Objects.equals(key, "")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        ThrowsDemo8 obj = new ThrowsDemo8();
        obj.getKey();
    }
}
