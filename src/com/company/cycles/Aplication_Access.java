package com.company.cycles;
import javax.swing.*;

public class Aplication_Access {
    public static void main(String args[]){
        String password = "Ulisses";
        String pass = "";

        while (password.equals(pass) == false){
            pass = JOptionPane.showInputDialog("Enter your password: ");

            if(password.equals(pass) == false){
                System.out.println("Password invalid");
            }
        }
        System.out.println("Password corect. Access granted");
    }
}
