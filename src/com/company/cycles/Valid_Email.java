package com.company.cycles;

import javax.swing.*;

public class Valid_Email {
    public static void main(String args []){
        // 14:26 min
        int arroba = 0;
        boolean punto = false;
        String mail = JOptionPane.showInputDialog("Introduce mail");

        for (int i = 0;i <mail.length() ; i++){
            if (mail.charAt(i) == '@'){
                arroba++;
            }
            if(mail.charAt(i) == '.'){
                punto = true;
            }
        }


        if(arroba == 1 && punto == true){
            System.out.println("Email correct");
        } else {
            System.out.println("Email is not correct");
        }
    }
}
