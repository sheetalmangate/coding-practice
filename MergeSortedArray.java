import java.util.Arrays;

/*
 * This class merge two sorted arrays in non-decreasing order
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * */


public class MergeSortedArray {

    public static void main( String...args) {

        int[] num = {4,5,6,0,0,0};
        int[] num2 = {1,2,3};

        merge(num,3,num2,3);
    }

    public static void merge( int[] nums1,int m, int[] nums2, int n){

        int j = m;
        for(int i = 0; i<n; i++ ) {
            nums1[j] = nums2[i];
            j++;
        }

        //Arrays.sort(nums1);
        MergeSortedArray.sort(nums1);

    }

    public static void sort(int[] arr ) {

        //insertion sort
        for( int i = 1; i< arr.length; i++ ) {

            int key = arr[i];
            int j = i-1;
            while( j >= 0 ) {

                if( key < arr[j] ) {
                    arr[i] = arr[j];
                    arr[j] = key;
                }
                j--;
            }
        }
    }
}
