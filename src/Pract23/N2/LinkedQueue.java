package Pract23.N2;
import java.util.function.Predicate;
import java.util.function.Function;

public class LinkedQueue extends AbstractQueue implements Queue {
    private Node head;
    private Node tail;
    private int size;

    public void enqueue(Object element) {
        assert element != null;
        head = new Node(element, null, head);
        if(head.next != null) {
            head.next.prev = head;
        }
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public Object element() {
        assert size > 0;
        return tail.value;
    }

    public Object dequeue() {
        Object ret = element();
        if (tail.prev != null) {
            tail = tail.prev;
            tail.next = null;
        } else {
            tail = null;
        }
        size--;
        return ret;
    }

    public void clear() {
        Node node = head;
        while(node != null) {
            Node newNode = node.next;
            node = null;
            node = newNode;
        }
        size = 0;
    }

    public void push(Object element) {
        assert element != null;
        tail = new Node(element, tail, null);
        if(tail.prev != null) {
            tail.prev.next = tail;
        }
        if (size == 0) {
            head = tail;
        }
        size++;
    }

    public Object peek() {
        assert size > 0;
        return head.value;
    }

    public Object remove() {
        assert size > 0;
        Object ret = peek();
        if (head.next != null) {
            head = head.next;
            head.prev = null;
        } else {
            head = null;
        }
        size--;
        return ret;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public LinkedQueue makeCopy() {
        LinkedQueue copy = new LinkedQueue();
        Node node = tail;
        while (node != null) {
            copy.enqueue(node.value);
            node = node.prev;
        }
        copy.size = size;
        return copy;
    }
}