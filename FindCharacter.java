import java.util.ArrayList;
import java.util.List;

/**
 *
 * You are given a 0-indexed array of strings words and a character x.
 * Return an array of indices representing the words that contain the character x.
 * Note that the returned array may be in any order.
 *
 * Input: words = ["leet","code"], x = "e"
 * Output: [0,1]
 * Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
 *
 *
 * Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
 * Output: []
 * Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
 *
 */


public class FindCharacter {


    public static List<Integer> findCharacterContaining( String[] words, char x ) {

        List<Integer> indices = new ArrayList<>();

        if( words.length > 50 || words.length < 1 ) return indices;

        for( int i =0; i<words.length; i++ ) {

            String s = words[i];

            for( int j =0; j<s.length(); j++ ) {

                char c = s.charAt(j);
                if( c == x ) {
                    indices.add(i);
                    break;
                }

            }
        }

        return indices;
    }


    public static void main( String[] args ) {

        String[] str = {"abc", "aaaa", "cbc"};

        System.out.println( findCharacterContaining( str, 'z' ) );
    }
}
