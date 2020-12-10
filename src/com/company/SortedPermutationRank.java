package com.company;

public class SortedPermutationRank {

    public static void main(String args[]) {

    }


    public static int findRank(String A) {

        // cdba
        int len = A.length();
        int rank = 1;
        for (int i = 0; i < len - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < len; j++) {
                if (A.charAt(i) > A.charAt(j)) {
                    count++;
                }
            }
            rank += (count * fact(len - (i + 1))) % 1000003;
        }

        return rank % 1000003;

    }

    public static int fact(int n) {
        int i = 1;
        for (int j = 2; j <= n; j++) {
            i = (i * j) % 1000003;
        }

        return i;
    }

}
