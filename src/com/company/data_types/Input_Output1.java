package com.company.data_types;
import javax.swing.*;

public class Input_Output1 {
    public static void main(String args[]){

        String name = JOptionPane.showInputDialog("Writting your name, please: ");
        String age = JOptionPane.showInputDialog("Writting your age, please: ");

        System.out.println("Hello " + name + " have "+ age + " age");
        int age_user= Integer.parseInt(age) + 1;

        System.out.println("The next year you have: " + age_user + " age");
    }
}
