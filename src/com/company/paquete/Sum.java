/*
 * Name: Brenda Barrios
 * Date: 19/02/2022
 * Description: Sum of integers used Scanner
 * */

package com.company.paquete;
import java.util.Scanner;


public class Sum {

    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Write the first number: ");
        number1 = entrada.nextInt();


        System.out.print("Write the second number: ");
        number2 = entrada.nextInt();

        sum = number1 + number2;

        System.out.printf("La suma es %d\n", sum);

    }
}

