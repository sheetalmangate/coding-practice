package DataStructure.queue;

public class Queue {

    int[] queue = new int[5];
    int front;
    int rear;
    int size;

    public void enQueue( int data ) {

        if( this.isFull() ) {
            System.out.println("Queue is full can not add element");
            return;
        }

        queue[this.rear] = data;
        rear = (rear+1)%5;
        size++;
    }

    public void deQueue() {

        if( this.isEmpty() ) {
            System.out.println("queue is empty");
            return;
        }
        front = (front+1)%5;
        size -= 1;

    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        if(getSize() == 0) return true;
        return false;
    }

    public boolean isFull() {

        if( getSize() == 5 ) return true;
        return false;

    }

    public void show() {

        for(int i =0; i<size;i++) {
            System.out.print(queue[(front+i)%5]+"  ");
        }
    }
}
