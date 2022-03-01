package com.company.data_types;

import javax.swing.*;

/**
 * Formateo d esalida
 * Print(formato,valor numerico)
 * Da dos decimales al resultado 4f da resultado ala cantidad de decimales
 * **/
public class Input_Number {
    public static void main(String args[]){
        double x = 10000.0;


        String num1 = JOptionPane.showInputDialog("Place the number: ");
        double num2 = Double.parseDouble(num1);

        System.out.println("La sqrt de " + num1+ " es : " );
        System.out.printf( "%1.2f", Math.sqrt(num2));
    }
}
