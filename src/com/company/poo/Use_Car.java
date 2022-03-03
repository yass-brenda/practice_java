package com.company.poo;

import java.sql.SQLOutput;

public class Use_Car {
    public static void main(String[] args){
        // Create an objetc
        // NameClass nameofyourobject nameofconstructor
        // Instancia de clase , ejemplar de clase
        Car car = new Car();

        car.set_color();

        System.out.println(car.get_color());
        System.out.println(car.say_height());
    }
}
