package Pract18;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo7 {
    public void getKey() {
        Scanner sc = new Scanner( System.in);
        String key = sc.nextLine();
        printDetails( key );
    }
    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch ( Exception e){
            System.out.println(e.getMessage());
        }
    }
    private String getDetails(String key) throws Exception{
        if(Objects.equals(key, "")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        ThrowsDemo7 obj = new ThrowsDemo7();
        obj.getKey();
    }
}
