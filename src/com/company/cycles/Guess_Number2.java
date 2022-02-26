package com.company.cycles;

import java.util.Scanner;

public class Guess_Number2 {
    public static void main(String args[]){
        int random = (int)(Math.random()*100);
        int number;
        int attemp = 0;
        Scanner sc = new Scanner(System.in);


        do {
            attemp++;
            System.out.println("Enter a number, please :");
            number = sc.nextInt();

            if(random < number){
                System.out.println("The number is less");
            } else if( random >number){
                System.out.println("The number is more bigger");
            }
        } while(number!= random);

        System.out.println("Correct.56You've got it " + attemp + " attemps");
    }
}
