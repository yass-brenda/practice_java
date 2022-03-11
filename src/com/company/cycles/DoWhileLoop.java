package com.company.cycles;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        int response = 0 ;
        do {
            System.out.println("Select the number of the desired option: ");
            System.out.println("1.Movies");
            System.out.println("2.Series");
            System.out.println("0.salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Thanks for visiting us");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Select the correct option");
            }

        } while (response !=0);
        System.out.println("Finishing");
    }
}
