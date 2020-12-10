package com.company;

import java.util.ArrayList;

public class RotateMatrix {
    public static void main(String args[]){

    }


    public void rotate(ArrayList<ArrayList<Integer>> a) {

        for(int i = 0 ; i < a.size() ; i++){
            for(int j = 0 ; i < a.get(i).size() && j < i ; j++)
            {
                int temp = a.get(i).get(j);
                a.get(i).set(j, a.get(j).get(i));
                //a[i][j] = a[j][i];
                a.get(j).set(i, temp);
                //a[j][i] = temp;

            }
        }
        for(int k = 0 ; k < a.size() ; k++){
            for(int i = 0 , j = a.get(i).size() - 1 ; i < j ; i++, j--){
                int temp = a.get(k).get(i);
                //int temp = a[k][i];
                a.get(k).set(i, a.get(k).get(j));
                //a[k][i] = a[k][j];
                a.get(k).set(j, temp);
                //a[k][j] = temp;
            }
        }


    }
}
