package Pract8;
public class N1 {
    public static void recursion(int n, int cur_num, int count, int k){
        if (count == n)
            return;
        System.out.print(cur_num + " ");
        k++;
        if (k == cur_num){
            k = 0;
            cur_num++;
        }
        recursion(n, cur_num, count+1, k);
    }

    public static void main(String[] args) {
        int n = 1;
        recursion(n, 1, 0, 0);
    }
}
