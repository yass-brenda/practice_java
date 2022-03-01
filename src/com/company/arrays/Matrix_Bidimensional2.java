package com.company.arrays;

public class Matrix_Bidimensional2 {
    public static void main(String[] args){
        int [][] my_array ={
                {2,3,4},
                {2,3,4},
                {2,3,4},
        };

        for(int[]fila:my_array){
            for (int z:fila){
                System.out.print(z+ " ");
            }
            System.out.println();
        }
    }
}
