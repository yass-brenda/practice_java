package com.company.poo.car;

import com.company.poo.car.Car;
import com.company.poo.car.Furgoneta;

public class Test_Vehicle {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.establece_color("red");

        Furgoneta furgoneta = new Furgoneta(3,4);
        furgoneta.establece_color("pink");
        furgoneta.configure_leather_seats("si");
        furgoneta.configureAirCondition("si");

        System.out.println(car1.say_data_general() +" " + car1.get_color()  );

        System.out.println(furgoneta.say_data_general() +" " + furgoneta.getDataFurgoneta() );
    }
}
