package company.interview.prep;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] a = {-2, -1, -3};
        maxSubArray(a);
    }

    public static int maxSubArray(final int[] A) {


        int maxSum = A[0];
        int sum  = A[0];

        for(int i = 1 ; i < A.length ; i++){

            sum += A[i];

            if (maxSum<0 && maxSum<A[i]) {
                maxSum = A[i];
            }


            if(sum > maxSum)
                maxSum = sum;

            if(sum < 0 ){
                sum = 0;
            }

//            System.out.println("sum : " + sum);
//            System.out.println("maxSum : " + maxSum);
        }
        return maxSum;
    }
}
