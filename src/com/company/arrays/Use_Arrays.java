package com.company.arrays;

import java.lang.reflect.Array;

public class Use_Arrays {
    public static void main(String[] args){
        int [] my_array2 = {1,2,3,4,5};
        int [] my_array = new int[5];
        // int mi_array [] = new int[5];
        my_array[0] = 1;
        my_array[1] = 2;
        my_array[2] = 3;
        my_array[3] = 4;
        my_array[4] = 5;


        for(int i = 0;i < my_array.length; i++){
            System.out.println("Value of index " + i + " = " + my_array[i]);
        }


    }
}
