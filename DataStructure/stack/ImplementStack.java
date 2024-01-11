
package stack;

public class ImplementStack {

    private final int SIZE = 5;
    private static int top = -1;
    public Integer[] stack = new Integer[SIZE];

    public boolean isFull() {

        if( top == ( this.stack.length -1 ) ) return true;
        return false;
    }

    public boolean isEmpty() {
        if( top == -1 ) return true;
        return false;
    }

    public void push( int number ) {

       if( isFull() ) {
           System.out.println("Stack is full : " +number);
           return;
       }

        System.out.println("pushing into stack");
        top++;
        this.stack[top] = number;

    }

    public void peek() {

      if( isEmpty() ) {
          System.out.println("Stack is empty ");
          return;
      }

      System.out.println( "current element on stack is : "+ this.stack[top] );

    }

    public void pop() {

        if( isEmpty() ) {
            System.out.println("Stack is empty ");
            return;
        }

        System.out.println("removing element from stack");
        this.stack[top] = null;
        top--;


    }

    public void printStack() {

        StringBuilder stackDisplay = new StringBuilder( "[ " );
        for( Integer number : this.stack ) {
            stackDisplay.append(number + ",");
        }
        stackDisplay.append(" ] ");
        System.out.println("Stack info : "+stackDisplay);

    }
    public static void main( String[] args ) {


        ImplementStack objStack = new ImplementStack();
        objStack.push(100);
        objStack.push(200);
        objStack.push(300);
//        objStack.peek();
        objStack.printStack();
        objStack.pop();
        objStack.printStack();
        objStack.push(400);
        objStack.push(500);
        objStack.printStack();
        objStack.pop();
        objStack.printStack();
        objStack.push(600);

        objStack.printStack();

        objStack.pop();
//        objStack.peek();
        objStack.printStack();


    }
}
