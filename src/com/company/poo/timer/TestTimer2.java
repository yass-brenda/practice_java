package com.company.poo.timer;

import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.*;

public class TestTimer2 {
    public static void main(String[] args) {
        Clock clock = new Clock(3000,true);
        clock.inProgress();
        JOptionPane.showMessageDialog(null,"Click for finished");
        System.exit(0);

    }
}

class Clock {
    public Clock(int interval,boolean sound){
        this.interval = interval;
        this.sound = sound;

    }


    public void inProgress(){
        ActionListener oyente = new SayTheHour2();
        Timer mytimer2 = new Timer(interval,oyente);
        mytimer2.start();
    }

    private int interval;
    private boolean sound;

    // Las clases internas admiten el private las otras solo public o el por defecto
    private class SayTheHour2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date now  = new Date();
            System.out.println("The hour to get each  3 seg: " + now );

            if(sound){ // con la clase interna accede a una variable encapsulada y que no es de su clase. Además de otra forma se deben crear métodos getter y setters.
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}