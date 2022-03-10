package com.company.poo;
import javax.swing.*;

public class Test_Car {
    public static void main(String[] args){
        // Create an objetc
        // NameClass nameofyourobject nameofconstructor
        // Instancia de clase , ejemplar de clase
        Car car = new Car();

        car.establece_color(JOptionPane.showInputDialog("Enter color: "));
        System.out.println(car.say_data_general());

        car.configure_leather_seats(JOptionPane.showInputDialog("Have leater seats ? Enter si/no: "));
        System.out.println(car.say_leather_seats());
        car.configureAirCondition(JOptionPane.showInputDialog("Have air condition ? Enter si/no: "));
        System.out.println(car.getterAirCondition());
        System.out.println(car.sayWeightPlataform());
        System.out.println("The final price is:" + car.priceCar());
    }
}
