import java.util.Arrays;

public class GenerateMatrix {

    public static void main( String[] args ) {

        GenerateMatrix obj = new GenerateMatrix();
        int[][] arr = obj.generateMatrix(4);

        for( int[] inner : arr ) {
            for( int num : inner ) {
                System.out.print( num + " ");
            }
            System.out.println("");
        }

    }

    public int[][] generateMatrix(int n) {


        if( n < 1 || n > 20 ) return new int[][]{ { 1 }};

        int m = n*n;
        System.out.println( "total number of squares " + m );
        

        int cnt = 1;
        int[][] arr = new int[n][n];

        for( int i = 0; i<n; i++ ) {

            for( int j = 0; j< n; j++ ) {

                arr[i][j] = cnt++;
            }
        }

        //return arr;
        return new int[][]{ { 1 }};
    }


}
