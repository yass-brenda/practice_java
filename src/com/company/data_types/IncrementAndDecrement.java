package com.company.data_types;

public class IncrementAndDecrement {
    public static void main(String[] args){
        int lives = 5;
        lives = lives -1;
        System.out.println(lives);//4

        lives--; // Decremento
        System.out.println(lives);//3

        lives++; //Incremento
        System.out.println(lives); // 4

        //Prefija : 4 +100
        int gift = 100 + lives++; //104
        System.out.println(gift);
        System.out.println(lives);

        //Posfijo :  100 +1+2
        int liv = 2;
        int gift2 = 100 + ++liv; //103
        System.out.println(gift2);

        int live = 2;
        int gift3 = 100 + live++; //100 + 3
        System.out.println(gift2);

    }
}
