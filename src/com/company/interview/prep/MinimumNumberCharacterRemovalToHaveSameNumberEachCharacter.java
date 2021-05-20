package com.company.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MinimumNumberCharacterRemovalToHaveSameNumberEachCharacter {

    public static void main(String[] args) {

        System.out.println("hello");

        //String S = "geeksforgeeks";
        String s = "abbbccccdddddeeeeeeefffffffgggggggg";
        int N = s.length();

        System.out.println(minimumDeletion(s, N));

    }

    static int minimumDeletion(String s, int n) {

        // Stores the frequency
        // of each character
        HashMap<Character, Integer> countMap = new HashMap<>();

        // Traverse the string
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            countMap.put(ch,
                    countMap.getOrDefault(ch, 0) + 1);
        }

        // Stores the frequency of each
        // charachter in sorted order
        ArrayList<Integer> countMultiset = new ArrayList<>(
                countMap.values());
        Collections.sort(countMultiset);

        // Stores the count of elements
        // required to be removed
        int ans = Integer.MAX_VALUE;

        int i = 0;

        // Stores the size of multiset
        int m = countMultiset.size();

        // Traverse the multiset
        for (int j : countMultiset) {

            // Update the ans
            ans = Math.min(ans, n - (m - i) * j);

            // Increment i by 1
            i++;
        }

        // Return
        return ans;
    }


}


//        1 5 4 3 7 7 8
//
//        1 3 4 5 7 7 8
//        1 3 4 5 7 7 8 8
//
//        0 1 2 3 4 5 6
//        1 3 4 5 7 7 8 = 35
//        unique character = 7
//
//        1 3 4 5 7 7 8 = 35
//        1 1 1 1 1 1 1
//        1 3 3 3 3 3 3
//
//        1. 1 -> 2 + 3 + 4 + 6 + 6 + 7 = 28
//        2. 3 -> 1 + 0 + 1 + 2 + 4 + 4 + 5 = 17
//        3. 4 -> 1 + 3 + 0 + 1 + 3 + 3 + 4 = 15
//        5. 5 -> 1 + 3 + 4 + 0 + 2 + 2 + 3 = 15
//        6. 7 -> 1 + 3 + 4 + 5 + 0 + 0 + 1 = 14
//        7. 7 -> 1 + 3 + 4 + 5 + 7 + 0 + 1 = 14
//        8. 7 -> 1 + 3 + 4 + 5 + 7 + 7 + 0 = 27
