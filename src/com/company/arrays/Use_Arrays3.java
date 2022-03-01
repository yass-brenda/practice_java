package com.company.arrays;

public class Use_Arrays3 {
    public static void main(String[] args){
        int [] matrix_random = new int[150];

        for (int i=0; i < matrix_random.length;i++){
            matrix_random[i] = (int) Math.round(Math.random()* 100);
        }

        for(int number:matrix_random){
            System.out.print(number + " ");
        }
    }
}
