import java.util.Arrays;

public class PrimeNumber {
    public static void main( String[] args ) {

        PrimeNumber obj = new PrimeNumber();
        System.out.println(Arrays.toString( obj.listPrimeNumbers( 10 ) ));
    }

    public int[] listPrimeNumbers( int n ) {

        int[] a = new int[n];
        int i = 2;
        int j = 1;

        if( n < 1) return a;

        a[0] = 1;

        while ( i < n ) {

            if( isPrimeNumber( i ) ) {

                a[j] = i;
                j++;
            }

            i++;
        }

        return a;
    }

    public boolean isPrimeNumber( int n ) {

        int i = 2;
        boolean isPrime = true;
        while( i < n ) {

            if( (n%i) == 0 ) {
                isPrime = false;
                break;
            }
            i++;
        }

        return isPrime;
    }
}
