package com.company;

public class TrailingZerosInFactorial {


    public static void main(String args[]){


        System.out.println(trailingZeroes(99));
        System.out.println(trailingZeroes(100));
        System.out.println(trailingZeroes(101));
    }



    public static int trailingZeroes(int A) {

        //5*any number will leave zero
        int result = 0;
        while(A != 0){
            result += A/5;
            A /= 5 ;
        }

        return result;
    }

}
