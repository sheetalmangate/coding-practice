import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {


    public static void main( String[] args ) {
        ValidParentheses obj = new ValidParentheses();
        System.out.println( obj.isValid("{)(}") );
    }

    public int getMatch( char s ) {

        int n=0;

        switch ( s ) {
            case ')' :
                n = (int)'(';
                break;
            case '}' :
                n = (int)'{';
                break;
            case ']' :
                n = (int)'[';
                break;
        }

        return n;
    }
    public boolean isValid( String s ) {

        if( s.length() <= 1 || ( s.length()%2 != 0 ) ) return false;

        char c;
        int a;
        int j = 0;
        List<Integer> stack  = new ArrayList<>();

        for( int i = 0; i<s.length(); i++ ) {

            c = s.charAt(i);
            a = c;

            if( c == '(' || c == '{' || c == '[' ) {

                stack.add(a);
                j++;

            } else if( c == ')' || c == '}' || c == ']' ) {

                    if( stack.size() > 0 && stack.get(j-1) == getMatch(c)) {
                        //remove element from stack == find out what to remove
                        stack.remove(j-1 );
                        j--;
                        continue;
                    }
                    return false;

            } else {

                return false;
            }

        }

        if(stack.size() > 0 ) return false;
        return true;


    }

}
