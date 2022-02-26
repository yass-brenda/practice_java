package com.company.cycles;
import java.util.*;

public class Guess_Number {
    public static void main(String args[]){
        int random = (int)(Math.random()*100);
        int number = 0;
        int attemp = 0;
        Scanner sc = new Scanner(System.in);

        while(number!= random){
            attemp++;
            System.out.println("Enter a number, please :");
            number = sc.nextInt();

            if(random < number){
                System.out.println("The number is less");
            } else if( random >number){
                System.out.println("The number is more bigger");
            }
        }
        System.out.println("Correct.56You've got it " + attemp + " attemps");

    }
}
