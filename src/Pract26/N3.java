package Pract26;

import java.util.HashMap;

public class N3 {
    public static void main(String[] args) {
        HashMap<Integer, Double> hashMap = new HashMap<>(){{
            put(1, 1.0);
            put(2, 2.0);
        }};

        System.out.println(hashMap.get(3));
        System.out.println(hashMap.get(1));
        hashMap.remove(2);
        System.out.println(hashMap);
    }
}
