package com.company.cycles;
import javax.swing.*;
import java.awt.*;

public class Factorial {
    public static void main(String args[]){
        Long result = 1L;
        int number =Integer.parseInt(JOptionPane.showInputDialog("Enter a number for calculate the function factorial"));

        for(int i = number ; i > 0; i--){
            result *= i;
        }
        System.out.println("The factorial of " + number + " number is " + result);
    }
}
