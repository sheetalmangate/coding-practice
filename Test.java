
import java.util.Arrays;
import java.util.stream.Stream;


public class Test {

    public static void main( String[] args ) {


        Test objTest = new Test();
        String[] myData = {"","b"};//{"flower", "flow", "flight"};//{ "dog","racecar","car" };
        //{"flower", "FLOW", "flight"} {"dog","racecar","car"}
        String op = objTest.longestCommonPrefix1( myData );
        //System.out.println(op);
    }

    public String longestCommonPrefix( String[] strs ) {

        if( strs.length <= 1 || strs.length >= 200 ) return "";

        strs = Arrays.stream( strs ).map(String::toLowerCase).sorted().toArray(String[]::new);

        String s = strs[0];
        String s1 = strs[strs.length-1];

        StringBuilder sb = new StringBuilder("");

        for( int i =0; i<s.length(); i++ ) {

            if( s.charAt(i) == s1.charAt(i)) {
                sb.append(s.charAt(i));
            }

        }

        return sb.toString();
    }

    public String longestCommonPrefix1( String[] strs ) {

        if( strs.length < 1 || strs.length > 200 ) return "";

        strs = Arrays.stream( strs ).filter( x -> x != "").map(String::toLowerCase).sorted().toArray(String[]::new);

        System.out.println(strs.length);

        String base = strs[0];

        for( int i=0; i<strs.length; i++ ) {

            for( int j = 1; j< strs.length; j++ ) {

                String word = strs[j];

                if( i == strs[j].length() || base.charAt(i) != strs[j].charAt(i) )
                    return base.substring(0,i);
            }
        }

        return base;

    }
}
