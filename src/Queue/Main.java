package Queue;

public class Main {
    public static void main(String[] args) {
        QueueExample myQueue = new QueueExample(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.enqueue(8);
        myQueue.enqueue(9);
        myQueue.dequeue();
        myQueue.printQueue();

    }
}
