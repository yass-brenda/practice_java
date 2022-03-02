package com.company.poo;

public class Use_Car {
    public static void main(String[] args){
        // Create an objetc
        // NameClass nameofyourobject nameofconstructor
        // Instancia de clase , ejemplar de clase
        Car car = new Car();

        // Do not encapsulation
        car.wheel = 2;

        System.out.println("The wheels are: " + car.wheel);
    }
}
