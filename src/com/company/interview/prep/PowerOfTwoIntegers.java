package company.interview.prep;

public class PowerOfTwoIntegers {

    public static void main(String args[]) {

    }

    public static int isPower(int A) {

        if (A == 1)
            return 1;
        if(A == 2 || A == 3)
            return 0;
        if ((A & (A - 1)) == 0)
            return 1;


        long sqrtA = (long) Math.sqrt(A);
        for (int i = 3; i <= sqrtA; i++) {
            for (int j = 2; j <= sqrtA; j++) {
                long result = (long) Math.pow(i, j);
                if(A > result)
                    break;
                if (A == result)
                    return 1;
            }
        }
        return 0;
    }
}
