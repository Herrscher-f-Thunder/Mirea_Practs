package Pract8;
public class N4 {
    public static int recursion(int k, int s){
        if (k==0 && s==0)
            return 1;
        if (k <= 0 || s <= 0)
            return 0;
        int amount = 0;
        for (int i = 0; i < 10; i++){
            amount += recursion(k-1, s-i);
        }
        return amount;
    }

    public static void main(String[] args) {
        int k = 2;
        int s = 5;
        System.out.print(recursion(k, s));
    }
}
