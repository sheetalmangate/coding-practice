package sorting;

import java.util.Arrays;

public class InsertionSort {

    public void sortNumbers( int[] numbers ) {

        if( numbers.length <= 1 ) {
            System.out.println(" Array is having single or no element  : no need to sort ");
            return;
        }

        for( int i = 1; i < numbers.length; i++ ) {

            int key = numbers[i];
            int j = i-1;

            while( j >= 0 && key < numbers[j] ) {
                numbers[j+1] = numbers[j];
                j--;
            }

            numbers[j+1] = key;

        }
        /*int counter = 1;
        while( counter < numbers.length ) {

            int key = numbers[counter];

            for( int i = counter; i>0; i-- ) {

                if( numbers[i] < numbers[i-1] ) {
                    //shift small number to right
                    int temp = numbers[i];
                    numbers[i] = numbers[i-1];
                    numbers[i-1] = temp;
                }
            }
            counter ++;
        }
        */
    }


    public static void main( String[] args ) {

        System.out.println("=================sorting array by Insertion Sort====================");
        int[] numbers = { 5,9,10,4,3 };
        InsertionSort objSort = new InsertionSort();

        System.out.println("Before sorting");
        System.out.println( Arrays.toString(numbers));

        objSort.sortNumbers( numbers );

        System.out.println("After Sorting");
        System.out.println( Arrays.toString(numbers));

    }
}
