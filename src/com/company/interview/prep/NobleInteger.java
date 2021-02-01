package company.interview.prep;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {

    public int solve(ArrayList<Integer> A) {
        if(A == null || A.size() ==0)
            return -1;

        //-4, -2, 0, -1, -6

        Collections.sort(A);
        // -6 -4 -2 -1 0 1 2 3
        int size = A.size();

        if(A.get(size-1) == 0)
            return 1;

        for (int i = 0; i < size - 1; i++) {
            if(A.get(i) < A.get(i+1)){
                if(A.get(i) == (size - i - 1))
                    return 1;
            }
        }
        return -1;

    }
}
