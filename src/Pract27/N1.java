package Pract27;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class N1 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(11);
        hashSet.add(1);
        hashSet.add(4);
        System.out.println("HashSet: " + hashSet);
        Set<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
