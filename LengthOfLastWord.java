public class LengthOfLastWord {

    public static void main( String[] args ) {

        LengthOfLastWord obj = new LengthOfLastWord();
        int length = obj.lengthOfLastWord( "My name is Sheetal" );
        System.out.println( length );

    }

    public int lengthOfLastWord( String s ) {

        if( s.length() < 1 ) return 0;

        s = s.trim();

        return s.length() - s.lastIndexOf(' ') - 1;
    }
}
