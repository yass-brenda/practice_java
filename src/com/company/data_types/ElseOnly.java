package com.company.data_types;

public class ElseOnly {
    public static void main(String[] args){
        int x = 3;
        int y = 3;

        /** if( x > 5){
            if(y > 5){
                System.out.println("X e Y are > 5");
            }
        } else {
            System.out.println("X es Y <= 5");
        }*/

        // La mejor manera sería realizarlo asi
        if(x > 5){
            if( y > 5){
                System.out.println("X e Y are > 5");
            }
        } else {
            System.out.println("X is <=5");
        }
    }
}
