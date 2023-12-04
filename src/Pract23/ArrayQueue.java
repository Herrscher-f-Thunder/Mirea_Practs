package Pract23;
public class ArrayQueue {
    private int head = -1;
    private int tail = -1;
    private Object[] elements = new Object[2];

    private Object[] newCapacity() {
        Object[] temp = new Object[elements.length * 2];
        int i = 0;
        while(head != tail){
            temp[i++] = elements[head++];
            if (head == elements.length) head = 0;
        }
        temp[i] = elements[tail];
        head = 0;
        tail = elements.length - 1;
        return temp;
    }

    //pre: element != null
    //post: elements[tail] = element
    public void enqueue(Object element) {
        if(isFull()){
            elements = newCapacity();
            enqueue(element);
            return;
        }
        tail = (tail+1)%elements.length;
        if(head == -1) head = tail;
        elements[tail] = element;
    }

    //pre: size > 0
    //post: elements[head]
    public Object element() {
        if (head != -1)
            return elements[head];
        else
            return null;
    }

    //pre: size > 0
    //post: elements[head]
    public Object dequeue() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        Object element = elements[head];
        elements[head] = null;
        head = (head+1)% elements.length;
        return element;
    }

    //post: size
    public int size() {
        if(tail >= head) return tail - head + 1;
        return (tail + elements.length) - head + 1;
    }

    //post:  (size == 0)
    public boolean isEmpty() {
        return head == -1;
    }
    public boolean isFull(){
        if(tail == head - 1) return true;
        return head == 0 && tail == elements.length - 1;
    }

    //post: size = 0, head = 0, tail = 0
    public void clear() {
        head = -1;
        tail = -1;
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        System.out.println(arrayQueue.element());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.element());
        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.isEmpty());
        arrayQueue.clear();
        System.out.println(arrayQueue.isEmpty());
    }
}
