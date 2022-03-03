package com.company.poo;

public class Car {
    // Propierties characteristics of an object
    private int wheel;
    private int heigth;
    private int width;
    private int engine;
    private int weight_plataform;

    String color;
    int weight_total;
    boolean leather_seats, air_condition;


    // Constructor : Contruction of sate initial of object
    public Car(){
        wheel = 4;
        heigth = 1000;
        weight_plataform = 300;
        engine = 1600;
        width = 600;
    }

    // Method getter always contain a retun
    public String say_height(){ // Getter say of value of the variabls
        return "The height of car is : " + heigth ;
    }

    public void set_color(){ // SETTER change the value of variabls
        color = "blue";
    }

    public String get_color(){
        return "The color of car is : " + color;
    }
}
