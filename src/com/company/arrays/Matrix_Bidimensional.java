package com.company.arrays;

public class Matrix_Bidimensional {
    public static void main(String[] args){
        int [][] my_array= new int[3][2]; // EL primer numero es la primera dimensión []

        // Empieza a contar desde el 0 o length -1
        my_array[0][0] = 1;
        my_array[0][1] = 2;


        my_array[1][0] = 1;
        my_array[1][1] = 2;


        my_array[2][0] = 1;
        my_array[2][1] = 2;


        System.out.println(my_array[2][1]);

        //  Two cycles for each dimension 1- hacia abajo

        for (int i=0; i < 3;i ++ ){ // First dimension
            for (int j = 0; j < 2;j++) {
                System.out.println("Position " + "[" + i + "] " + "[" + j + "] " + "the value is " + my_array[i][j]);
            }
            System.out.println();
        }
    }
}
