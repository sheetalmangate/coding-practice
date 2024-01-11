import java.util.Locale;

public class FirstOccurrence {

    public static void main( String[] args ) {

        FirstOccurrence obj = new FirstOccurrence();
        String s = "sadbutsad";
        String n = "sad";
        System.out.println( obj.strStr( s.toLowerCase(Locale.ROOT), n ) );

        String s1 = "Hello planet earth, you are a great planet.";
        System.out.print(s1.indexOf("planet"));
    }

    public int strStr(String haystack, String needle) {

        if( haystack.length() == 0 ) return -1;

        return haystack.indexOf( needle );
    }

}
