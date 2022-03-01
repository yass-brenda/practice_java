package com.company.arrays;

public class Example_Array_2D {
    public static void main(String[] args){
        double accumulated;
        double interest= 0.10;

        double [][] salary = new double[6][5];

        for (int i=0; i<6; i++){
            salary[i][0] = 10000;
            accumulated= 10000;
            for (int j=1;j<5 ;j++){
                accumulated = accumulated + (accumulated * interest);
                salary[i][j] = accumulated;
            }
            interest =interest +0.1;
        }
        for (int z=0;z<6;z++){
            System.out.println();
            for (int h =0; h<5;h++){
                System.out.printf("%1.2f",salary[z][h]);
                System.out.print(" ");
            }
        }
    }
}
