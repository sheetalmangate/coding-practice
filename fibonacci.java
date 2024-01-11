/*
* This file prints fibonacci series for first 10 numbers
*
* */

public class fibonacci {

    public static void generateFibonacciSequence( int num ) {

        int x = 0;
        int y = 1;
        int current;

        for( int i= 0; i <num; i++ ) {

            if( i <= 1 ) {
                System.out.print( i + " " );
            } else {
                current = x+y;
                System.out.print( current + " " );
                x = y;
                y = current;
            }

        }

    }

    public static void main( String[] args) {

        generateFibonacciSequence(10);
    }
}
