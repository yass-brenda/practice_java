package com.company.poo.timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class TestTimer {
    public static void main(String[] args){
        SayTheHour oyente = new SayTheHour();
        // ActionListener oyente =  new SayTheHour();

        Timer myTimer = new Timer(5000,oyente);
        myTimer.start();

        JOptionPane.showMessageDialog(null,"Click for leave");
        System.exit(0);
    }
}

class SayTheHour implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("The hour each 5 sg : " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}