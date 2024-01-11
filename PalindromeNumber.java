


public class PalindromeNumber {

    public static void main( String[] args ) {

        PalindromeNumber obj = new PalindromeNumber();
        int x = 2147483647;

        String s = ( obj.isPalindrome( x ) ) ? x+" is palindrome" : x+" is not palindrome ";
        System.out.println(s);
    }

    public boolean isPalindrome( int x ) {

        if( x < 0 ) return false;

        int n = x;
        int r = 0;

        while ( n > 0 ) {
            r = (r*10) + (n%10);
            n = n/10;
        }

        if( x == r ) return true;

        return false;
    }

}
