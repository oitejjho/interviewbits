package com.company;

public class NextSimilarNumber {

    public static void main(String args[]) {


        String a = "218765";
        String b = "27865";
        String c = "4321";
        System.out.println(solve(a));
        System.out.println(solve(b));
        System.out.println(solve(c));

    }

    public static String solve(String A) {
        int index = findIndex(A);
//        System.out.println("index " + index);
        if (index == -1)
            return "-1";

        StringBuilder inputA = new StringBuilder(A);
        for (int i = inputA.length() - 1; i > index; i--) {
            if(inputA.charAt(i) > inputA.charAt(index)){
                Character temp = inputA.charAt(i);
                inputA.setCharAt(i, inputA.charAt(index));
                inputA.setCharAt(index, temp);
                break;
            }
        }
//        System.out.println(inputA);
        return reverse(inputA.toString(), index+1, inputA.length());

    }


    public static int findIndex(String A) {
        for (int i = A.length() - 1; i >= 1; i--) {
            if (A.charAt(i) > A.charAt(i - 1)) {
//                System.out.println(i);
                return i - 1;
            }
        }

        return -1;
    }


    public static String reverse(String input, int firstIndex, int lastIndex) {

        StringBuilder prefixBuilder = new StringBuilder(input.substring(0, firstIndex));
        StringBuilder reverseNumber = new StringBuilder(input.substring(firstIndex, lastIndex)).reverse();
        prefixBuilder.append(reverseNumber);

        return prefixBuilder.toString();

    }


}
