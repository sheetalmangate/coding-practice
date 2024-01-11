package DataStructure.queue;

public class QueueRunner {

    public static void main( String[] args ) {

        Queue queue = new Queue();
        queue.enQueue(5);
        queue.enQueue(2);
        queue.enQueue(7);
        queue.enQueue(3);
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(9);
        queue.enQueue(1);
        queue.enQueue(12);
        queue.enQueue(18);
        queue.show();
    }
}
