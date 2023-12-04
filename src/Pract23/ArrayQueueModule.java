package Pract23;

public class ArrayQueueModule {
    private static int head;
    private static int tail;
    private static Object[] elements = new Object[2];

    static Object[] newCapacity() {
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
    public static void enqueue(Object element) {
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
    public static Object element() {
        if (head != -1)
            return elements[head];
        else
            return null;
    }

    //pre: size > 0
    //post: elements[head]
    public static Object dequeue() {
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
    public static int size() {
        if(tail >= head) return tail - head + 1;
        return (tail + elements.length) - head + 1;
    }

    //post:  (size == 0)
    public static boolean isEmpty() {
        return head == -1;
    }
    public static boolean isFull(){
        if(tail == head - 1) return true;
        return head == 0 && tail == elements.length - 1;
    }

    //post: size = 0, head = 0, tail = 0
    public static void clear() {
        head = -1;
        tail = -1;
    }

    public static void main(String[] args) {
        ArrayQueueModule arrayQueueModule = new ArrayQueueModule();
        enqueue(1);
        enqueue(2);
        Object h = (dequeue());
        System.out.println(element());
        System.out.println(dequeue());
        System.out.println(size());
        System.out.println(isEmpty());
        clear();
        System.out.println(isEmpty());
    }
}