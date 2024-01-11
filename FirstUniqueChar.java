public class FirstUniqueChar {

    public static void main( String[] args ) {

        String s1 = new String( "Hello" );
        String s2 = "Hello";
        //System.out.println(s1==s2);

        StringBuilder sb = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");

        //System.out.println(sb.equals(sb2));

        String str = new String("Hello").intern();
        String str1 = "Hello";
        System.out.println(str == str1);

    }

    public int firstUniqChar( String s ) {

        if( s.length() == 0 ) return -1;

        char c;

        for( int i =0; i< s.length(); i++ ) {

            c = (char) s.charAt(i);

            for( int j = i+1; j<s.length(); j++ ) {

                if( c != s.charAt(j) ) {

                    if( j == s.length() ) {

                        return i;
                    }

                } else {
                    break;
                }

            }

        }

        return 0;
    }
}
