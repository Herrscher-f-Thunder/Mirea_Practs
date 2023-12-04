package Pract18;

public class ThrowsDemo6 {
    public void printMessage(String key) {
        String message;
        try {
            message = getDetails(key);
        } catch (NullPointerException e){
            message = e.getMessage();
        }
        System.out.println( message );
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key;
        }

    public static void main(String[] args) {
        ThrowsDemo6 obj = new ThrowsDemo6();
        obj.printMessage(null);
    }
}

