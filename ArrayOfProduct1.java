public class ArrayOfProduct1 {

    /*
     * returning array of product of array element excluding current index
     * i/p {1,2,3,4,5}
     * o/p { 120, 60, 40, 30, 24 }
     *
     * { 8,3,4,6,7} = { 504,1344, 1008, 672, 576   }
     *
     * */
    public static void main( String[] args ) {

        int[] arrProd = ArrayOfProduct1.calculate(new int[] { 1,2,3,4,5});

        for( int x : arrProd) {
            System.out.print( x + " ");
        }

        int[] arrProd1 = ArrayOfProduct1.calculate1(new int[] { 1,2,3,4,5});

        System.out.println();
        for( int x : arrProd1) {
            System.out.print( x + " ");
        }
    }

    public static int[] calculate1( int[] nums ) {

        int product =1;
        int[] arrProd = new int[nums.length];

        for( int i =0; i< nums.length; i++ ) {

            product *= nums[i];
        }

        for( int i = 0; i< nums.length; i++ ) {

            arrProd[i] = (i==0) ? product: product/nums[i];
        }

        return arrProd;
    }


    public static int[] calculate( int[] nums ) {

        int[] arrProd = new int[nums.length];

        for( int i = 0; i<nums.length; i++ ) {

            arrProd[i] = product(i, nums );

        }

        return arrProd;

    }

    public static int product( int index, int[] nums ) {

        int product = 1;
        for( int i =0; i<nums.length; i++ ) {

            if( i == index ) continue;

            product *= nums[i];
        }

        return product;
    }
}
