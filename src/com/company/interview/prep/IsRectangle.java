package company.interview.prep;

import java.util.TreeSet;

public class IsRectangle {

    public static void main(String args[]){

    }


    public static int solve(int A, int B, int C, int D) {

        if((A==B)&&(C==D))
            return 1;
        if((A==C)&&(D==D))
            return 1;
        if((A==D)&&(B==C))
            return 1;
        return 0;

    }
}
