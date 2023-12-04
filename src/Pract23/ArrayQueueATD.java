package Pract23;

public class ArrayQueueATD {
    private int size;
    private int head;
    private int tail;
    private Object[] elements = new Object[2];
    static Object[] newCapacity(ArrayQueueATD queueATD){
        Object[] temp = new Object[queueATD.elements.length * 2];
        int i = 0;
        while(queueATD.head != queueATD.tail){
            temp[i++] = queueATD.elements[queueATD.head++];
            if (queueATD.head == queueATD.elements.length) queueATD.head = 0;
        }
        temp[i] = queueATD.elements[queueATD.tail];
        queueATD.head = 0;
        queueATD.tail = queueATD.elements.length - 1;
        return temp;
    }

    //pre: element != null
    //     queueATD != null
    //post: elements[tail] = element
    public static void enqueue(ArrayQueueATD queueATD, Object element) {
        if(isFull(queueATD)){
            queueATD.elements = newCapacity(queueATD);
            enqueue(queueATD, element);
            return;
        }
        queueATD.tail = (queueATD.tail+1)%queueATD.elements.length;
        if(queueATD.head == -1) queueATD.head = queueATD.tail;
        queueATD.elements[queueATD.tail] = element;
    }

    //pre: size > 0
    //     queueATD != null
    //post: elements[head]
    public static Object element(ArrayQueueATD queueATD) {
        if (queueATD.head != -1)
            return queueATD.elements[queueATD.head];
        else
            return null;
    }

    //pre: size > 0
    //     queueATD != null
    //post: elements[head]
    public static Object dequeue(ArrayQueueATD queueATD) {
        if(isEmpty(queueATD)){
            System.out.println("Queue is empty");
            return null;
        }
        Object element = queueATD.elements[queueATD.head];
        queueATD.elements[queueATD.head] = null;
        queueATD.head = (queueATD.head+1)% queueATD.elements.length;
        return element;
    }

    //pre  queueATD != null
    //post: size
    public static int size(ArrayQueueATD queueATD) {
        if(queueATD.tail >= queueATD.head) return queueATD.tail - queueATD.head + 1;
        return (queueATD.tail + queueATD.elements.length) - queueATD.head + 1;
    }

    //pre  queueATD != null
    //post:  (size == 0)
    public static boolean isEmpty(ArrayQueueATD queueATD) {
        return queueATD.head == -1;
    }
    public static boolean isFull(ArrayQueueATD queueATD){
        if(queueATD.tail == queueATD.head - 1) return true;
        return queueATD.head == 0 && queueATD.tail == queueATD.elements.length - 1;
    }

    //pre  queueATD != null
    //post: size = 0, head = 0, tail = 0
    public static void clear(ArrayQueueATD queueATD) {
            queueATD.head = -1;
            queueATD.tail = -1;
    }
    public static void main(String[] args) {
        ArrayQueueATD arrayQueueATD = new ArrayQueueATD();
        ArrayQueueATD help = new ArrayQueueATD();
        enqueue(arrayQueueATD,4);
        enqueue(arrayQueueATD, 2);
        enqueue(arrayQueueATD, 3);
        Object h = (dequeue(arrayQueueATD));
        System.out.println(element(arrayQueueATD));
        System.out.println(dequeue(arrayQueueATD));
        System.out.println(element(arrayQueueATD));
        System.out.println(size(arrayQueueATD));
        System.out.println(isEmpty(arrayQueueATD));
        clear(arrayQueueATD);
        System.out.println(isEmpty(arrayQueueATD));
    }
}
