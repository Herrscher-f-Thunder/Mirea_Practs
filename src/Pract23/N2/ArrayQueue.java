package Pract23.N2;
import java.util.function.Predicate;
import java.util.function.Function;

public class ArrayQueue extends AbstractQueue implements Queue {
    private int head;
    private int tail;
    private int size;
    private Object[] elements = new Object[10];

    private void fixCapacity(int capacity) {
        int len = elements.length;
        if (capacity > len) {
            Object[] newElements = new Object[elements.length * 2];
            int i = 0;
            while (tail!=head) {
                newElements[i] = elements[head];
                head = (head + 1) % len;
                i++;
            }
            head = 0;
            tail = len - 1;
            elements = newElements;
        }
    }

    public void enqueue(Object element) {
        assert element != null;
        fixCapacity(size + 2);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public Object element() {
        assert size > 0;
        return elements[head];
    }

    public Object dequeue() {
        Object ret = element();
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return ret;
    }

    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }

       public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

}