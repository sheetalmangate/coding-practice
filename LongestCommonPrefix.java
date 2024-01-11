import java.util.Arrays;
import java.util.stream.Stream;

public class LongestCommonPrefix {

    public static void main( String[] args ) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String[] str = { "mineral123", "mini", "mint1" };
        //String[] str = { "reflower","flow","flight" };
        System.out.println( obj.longestCommonPrefix( str ) );
    }


    public String longestCommonPrefix(String[] strs ) {

        if( strs.length < 1 ) return "";

        if( strs.length == 1 ) return strs[0];

        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder("");
        String str1 = strs[0];
        String str2 = strs[strs.length-1];


        for( int i = 0; i< str1.length(); i++ ) {

            if( str1.charAt(i) != str2.charAt(i) ) {
              break;
            }
            sb.append( str1.charAt(i) );
        }

        //return sb.toString();
        return new String(sb);
    }

    //sort String without using Arrays.sort() method

    public String sortString1( String str ) {

        if( str.length() < 1 ) return "";

        return "";

    }
}
