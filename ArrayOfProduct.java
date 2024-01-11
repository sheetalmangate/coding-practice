public class ArrayOfProduct {

    /*
     * returning array of product of array element excluding current index
     * i/p {1,2,3,4,5}
     * o/p { 120, 60, 40, 30, 24 }
     *
     * { 8,3,4,6,7} = { 504,1344, 1008, 672, 576   }
     *
     * */
    public static void main(String[] args) {

        int[] arrProd = ArrayOfProduct.calculate(new int[]{1,2,3,4,5});

        for (int x : arrProd) {
            System.out.print(x + ", ");
        }

    }

    public static int[] calculate(int[] nums) {

        int product = 1;
        int[] arrProd = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            product *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {

            arrProd[i] = product / nums[i];
        }

        return arrProd;
    }

}

