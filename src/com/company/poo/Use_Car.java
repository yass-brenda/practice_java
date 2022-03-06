package com.company.poo;
import
public class Use_Car {
    public static void main(String[] args){
        // Create an objetc
        // NameClass nameofyourobject nameofconstructor
        // Instancia de clase , ejemplar de clase
        Car car = new Car();

        car.establece_color("Blue");
        System.out.println(car.say_data_general());

        car.configure_leather_seats("no");
        System.out.println(car.say_leather_seats());
        car.configureAirCondition("si");
        System.out.println(car.getterAirCondition());
        System.out.println(car.sayWeightPlataform());
        System.out.println("The final price is:" + car.priceCar());
    }
}
