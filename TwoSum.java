import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {

    public static void main( String[] args ) {

        TwoSum obj = new TwoSum();
        int[] arr = {-1,-2,-3,-4,-5};
        System.out.println(Arrays.toString( obj.twoSum(arr , -8 ) ) );

    }

    public int[] twoSum( int[] nums, int target ) {

        if( nums.length < 2 ) {
            return new int[]{0};
        }

        for( int i = 0; i<nums.length; i++ ) {

            for( int j = i+1; j < nums.length; j++ ) {

                if( (  nums[i]  + nums[j] ) == target ) {

                    return new int[] { i, j };
                }

            }
        }
        return new int[] {0};


    }
}
