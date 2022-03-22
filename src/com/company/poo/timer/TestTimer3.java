package com.company.poo.timer;

import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.*;

public class TestTimer3 {
    public static void main(String[] args) {
        Clock2 clock = new Clock2();
        clock.inProgress(3000,true);
        JOptionPane.showMessageDialog(null,"Click for finished");
        System.exit(0);

    }
}

class Clock2 {
    public void inProgress(int interval,final boolean sound){ // The class only visible in this method
        // Las clases INTERNAS LOCALES
        class SayTheHour3 implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date now  = new Date();
                System.out.println("The hour to get each  3 seg: " + now );

                if(sound){ // por ese motivo se declara en el metodo como final
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        ActionListener oyente = new SayTheHour3();
        Timer mytimer2 = new Timer(interval,oyente);
        mytimer2.start();

    }

}