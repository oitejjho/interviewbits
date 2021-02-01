package company;

import java.util.*;

public class LargestNumber {

    public static void main(String args[]) {

//        largestNumber(Arrays.asList(3,30,34,5,9));
//        largestNumber(Arrays.asList(0,0,0,0));


        String a = "anik";
        String b = "anik";
        b = "oitejjho";
        System.out.println(a);
        System.out.println(b);


    }


    public static void stringExample(String a) {

    }

    public static String largestNumber(final List<Integer> A) {

        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String input1 = o1 + "" + o2;
                String input2 = o2 + "" + o1;
                return input2.compareTo(input1);
            }
        });

        if (A.get(0) == 0)
            return "0";

        StringBuilder result = new StringBuilder();
        for (Integer a :
                A) {
            result.append(a);
        }

//        System.out.println(result.toString());
        return result.toString();

    }



}



