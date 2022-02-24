package com.company.paquete;
import java.util.Scanner;

public class Avalie_age {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age : ");
        int age = sc.nextInt();

        if (age < 18){
            System.out.println("You are a teenager");
        } else if (age < 40){
            System.out.println("You're young");
        } else if (age < 65) {
            System.out.println("You are mature");
        } else {
            System.out.println("Take care of yourself");
        }


    }
}
