package Pract23.N2;
public class Node {
    Object value;
    Node prev;
    Node next;

    public Node(Object value, Node prev, Node next) {
        assert value != null;
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}