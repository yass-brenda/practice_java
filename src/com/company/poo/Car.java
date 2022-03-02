package com.company.poo;

public class Car {
    // Propierties characteristics of an object
    private int wheel;
    private int heigth;
    private int width;
    private int engine;
    private int weight;

    // Constructor : Contruction of sate initial of object
    public Car(){
        wheel = 4;
        heigth = 1000;
        weight = 300;
        engine = 1600;
        width = 600;
    }

    // Method getter always contain a retun
    public String say_height(){
        return "The height of car is :" + heigth ;
    }

}
