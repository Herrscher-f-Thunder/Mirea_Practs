package Pract11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class N5 {
    public static void main(String[] args) {
        long startTime, endTime;
        ArrayList <Integer> arrayList = new ArrayList<>();
        LinkedList <Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++){
            arrayList.add(random.nextInt());
            linkedList.add(random.nextInt());
        }
        //Insert
        startTime = System.nanoTime();
        arrayList.add(500, 25);
        endTime = System.nanoTime();
        long arrayInsert = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.add(500, 25);
        endTime = System.nanoTime();
        long linkedInsert = endTime - startTime;
        //Remove
        startTime = System.nanoTime();
        arrayList.remove(500);
        endTime = System.nanoTime();
        long arrayRemove = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.remove(500);
        endTime = System.nanoTime();
        long linkedRemove = endTime - startTime;
        //Add
        startTime = System.nanoTime();
        arrayList.add(25);
        endTime = System.nanoTime();
        long arrayAdd = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.add(25);
        endTime = System.nanoTime();
        long linkedAdd = endTime - startTime;
        //Search
        int elem = arrayList.get(500);
        startTime = System.nanoTime();
        arrayList.indexOf(elem);
        endTime = System.nanoTime();
        long arraySearch = endTime - startTime;

        elem = linkedList.get(500);
        startTime = System.nanoTime();
        linkedList.indexOf(elem);
        endTime = System.nanoTime();
        long linkedSearch = endTime - startTime;

        System.out.print("ArrayList:" +
                "\nВставка: " + arrayInsert +
                "\nУдаление: " + arrayRemove +
                "\nДобавление: " + arrayAdd +
                "\nПоиск: " + arraySearch);
        System.out.print("\n\nLinkedList:" +
                "\nВставка: " + linkedInsert +
                "\nУдаление: " + linkedRemove +
                "\nДобавление: " + linkedAdd +
                "\nПоиск: " + linkedSearch);
    }
}
