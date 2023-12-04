package Pract8;

public class N5 {
    public static int recursion(int a){
        if (a == 0)
            return 0;
        return a%10 + recursion(a/10);
    }

    public static void main(String[] args) {
        int n = 123456;
        System.out.print(recursion(n));
    }
}
