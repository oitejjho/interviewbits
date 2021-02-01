package company.interview.prep;

public class MinStepsinInfiniteGrid {

    public int coverPoints(int[] A, int[] B) {

        int distance = 0;
        for(int i = 0 ; i < A.length - 1 ; i++){
            int maxDistance = max(Math.abs(A[i] - A[i+1]), Math.abs(B[i] - B[i+1]));
            distance += maxDistance;
        }
        return distance;
    }

    private int max(int a, int b){
        if(a > b)
            return a;
        return b;

    }
}
