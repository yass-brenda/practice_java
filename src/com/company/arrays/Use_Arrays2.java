package com.company.arrays;
import javax.swing.*;

public class Use_Arrays2 {
    public static void main(String[] args){
        String [] countries = new String[8];
        //String [] countries = {"España","Mexico","Colombia","Perú","Chile","Argentina","Ecuador","venezuela"};


        for (int i = 0; i<8; i++){
            countries[i] = JOptionPane.showInputDialog("Introduce pais " + (i+1) );
        }

        for(String elemento:countries){
            System.out.println("Pais: " +elemento);
        }


    }
}
