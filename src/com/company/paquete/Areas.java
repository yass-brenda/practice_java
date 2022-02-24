package com.company.paquete;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Areas {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a option: \n1: Square  \n2: Rectangle  \n3: Triangle  \n4: Circle ");
        int figure = sc.nextInt();

        switch (figure){
        case 1:
            int side = Integer.parseInt(JOptionPane.showInputDialog("Write the side"));
            System.out.println("The area of the square is " + Math.pow(side,2));
            break;
        case 2:
            int height = Integer.parseInt(JOptionPane.showInputDialog("Write the height"));
            int base = Integer.parseInt(JOptionPane.showInputDialog("Write the base"));
            System.out.println("The area of the rectangle: " + (base * height));
            break;
        case 3:
            height = Integer.parseInt(JOptionPane.showInputDialog("Write the height"));
            base = Integer.parseInt(JOptionPane.showInputDialog("Write the base"));
            System.out.println("The area of the triangle: " + (base * height)/2);
            break;
        case 4:
            int radio = Integer.parseInt(JOptionPane.showInputDialog("Write the radio"));
            System.out.print("The area of the circle: ");
            System.out.printf("%1.2f",Math.PI *(Math.pow(radio,2)));
            break;
        default:
            System.out.println("The option is not correct");

        }
    }
}
