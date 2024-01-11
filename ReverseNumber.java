public class ReverseNumber {

    public static void main( String[] args ) {

        int rNumber = ReverseNumber.getReverse( -600000 );

        System.out.println( " reverse number is "+rNumber);


    }

    public static int getReverse( int num ) {

        if( num > 0 ) {
            return reverse(num);
        } else {
            return reverse(num * (-1)) * (-1);
        }
    }
    public static int reverse( int num ) {

        System.out.println(num);
        int sum = 0;

        while (num>0) {

            sum = (sum*10)+num%10;
            num = num/10;
        }

        return sum;

    }
}
