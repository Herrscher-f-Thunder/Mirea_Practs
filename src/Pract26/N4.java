package Pract26;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class N4 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(Comparator.comparingInt(String::hashCode)) {{
            add("A");
            add("B");
            add("C");
            add("D");
            add("E");
            add("F");
            add("G");
            add("H");
            add("J");
            add("K");
        }};

        for (int i = 0; i < 5; ++i) {
            String s = queue.poll();
            System.out.println(s);
            assert s != null;
            System.out.println(s.hashCode());
        }
    }
}