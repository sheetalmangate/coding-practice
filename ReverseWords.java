public class ReverseWords {

    public static void main( String[] args ) {

        ReverseWords obj = new ReverseWords();
        String str = "Hello World";
        System.out.println( obj.reverseString( str ) );
    }

    public String reverseString( String s ) {

        String[] word = s.split(" ");
        int n = word.length;
        StringBuilder sb = new StringBuilder();

        for( int i =n-1 ; i>=0; i-- ) {
            sb.append( word[i]).append(" ");
        }
        return sb.toString();
    }
}
