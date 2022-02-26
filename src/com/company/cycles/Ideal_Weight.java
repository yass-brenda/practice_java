package com.company.cycles;
import javax.swing.*;
import javax.swing.JOptionPane.*;
public class Ideal_Weight {
    public static void main (String args[]){
        String gender ="";

        do {
            gender = JOptionPane.showInputDialog("Enter your gender(F/M");
        } while(gender.equalsIgnoreCase("F") == false && gender.equalsIgnoreCase("M")==false);

        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height in cm:  "));
        int ideal_weight = 0;

        if (gender.equalsIgnoreCase("M")){
            ideal_weight = height - 110;
        } else if (gender.equalsIgnoreCase("F")){
            ideal_weight = height - 120;
        }

        System.out.println("Your ideal weight is " + ideal_weight + "kg");
    }
}
