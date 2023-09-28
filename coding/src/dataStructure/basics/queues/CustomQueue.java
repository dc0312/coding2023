package dataStructure.basics.queues;

public class CustomQueue {
    private int maxSize;

    private int nElems;

    private int front;

    private int rear;

    private int[] arr;

    public CustomQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = 0;
        rear = -1;
        nElems = 0;
    }

    public void queue(int val) {
        if (isFull()) {
            return;
        }
        if (rear == maxSize -1) {
            rear = -1;
        }

        arr[++rear] = val;
        nElems++;
    }

    public int deQueue() {
        if (isEmpty()) {
            return -1;
        }
        int temp = arr[front++];
        if (front == maxSize) {
            front = 0;
        }
        nElems--;
        return temp;
    }

    public boolean isFull() {
        return nElems == maxSize;
    }

    public boolean isEmpty() {
        return nElems == 0;
    }

    public void display() {

        for (int i = front; i < maxSize; i++) {
            System.out.print(arr[i] + ",");
        }
        if (rear < front) {
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + ",");
            }
        }

        System.out.println();
    }

    public int size() {
        return nElems;
    }

    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue(5);
        customQueue.queue(1);
        customQueue.queue(2);
        customQueue.queue(3);
        customQueue.queue(4);
        customQueue.display();
        customQueue.queue(5);
        customQueue.display();
        System.out.println("Dequeue : " + customQueue.deQueue());
        customQueue.display();
        customQueue.queue(6);
        customQueue.display();
        System.out.println("Dequeue : " + customQueue.deQueue());
        customQueue.display();
    }
}
