package Pract18;

public class ThrowsDemo {
    public void getDetails(String key) {
        /* 1
        if(key == null) {
            throw newNullPointerException("null key in getDetails");
        }
        */
        //2
        try {
            if (key == null)
                throw new NullPointerException("null key in getDetails");
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("Ключ: " + key);
    }

    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();
        obj.getDetails(null);
    }
}