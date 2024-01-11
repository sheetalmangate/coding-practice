package DataStructure.stack;

public class Stack {

    private int max = 5;
    private int top = -1;
    private int[] stack = new int[max];

    public void push( int value ) {

        //check if stack is full
        //increment top by one
        //push element where top is pointing

        if(this.isFull()) {
            System.out.println("Stack is full can not push element");
            return;
        }

        this.top += 1;

        this.stack[this.top] = value;

    }

    public void pop() {

        //check if stack is empty
        //if not delete element on top
        //decrease top by 1

        if( this.isEmpty() ) {
            System.out.println("Stack is empty");
            return;
        }

        this.stack[this.top] = 0;
        this.top -= 1;

    }

    public void pick() {
        if( this.isEmpty() ) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Topmost element of stack is " + this.stack[this.top]  );
    }
    public boolean isFull() {
        if( this.top == this.max) {
            return true;
        }
        return false;
    }


    public boolean isEmpty() {
        if(this.top == -1 ) {
            return true;
        }
        return false;

    }

    public static void main( String[] args ) {

        Stack s = new Stack();
        s.push(11);
        s.push(76);
        s.push(71);
        s.push(15);
        s.push(66);

        s.pick();
        s.pop();
        s.pop();
        s.pick();


    }
}
