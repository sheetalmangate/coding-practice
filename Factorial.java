public class Factorial {

    public static void main( String[] args ) {

        Factorial obj = new Factorial();
        System.out.println(obj.getFactorial(10 ));
    }

    public int getFactorial( int n ) {

        if( n > 0 ) {

            return n * getFactorial( n-1 );
        } else {
            return 1;
        }



    }
}
