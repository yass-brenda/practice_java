package com.company.poo;

public class Car {
    // Propierties characteristics of an object
    private int wheel;
    private int heigth;
    private int width;
    private int engine;
    private int weightPlataform;

    private String color;
    private int weighTotal;
    private boolean leatherSeats, airCondition;


    // Constructor : Contruction of sate initial of object
    public Car(){
        wheel = 4;
        heigth = 1000;
        weightPlataform = 300;
        engine = 1600;
        width = 600;
    }

    // Method getter always contain a retun
    public String say_data_general(){ // Getter say of value of the variabls
        return "The car has: " + wheel + "wheels" +
                ". Measure " + heigth/1000 + " meters with a width of " + width +
                " cm and an width of plataform " + weightPlataform + "kg" ;
    }

    public void establece_color(String color_coche){ // SETTER change the value of variabls
        color =  color_coche;
    }

    public String get_color(){
        return "The color of car is : " + color;
    }

    public void configure_leather_seats(String leather_seats){ //SETTER
        // Si no lleva el this se refiere al argumento  si lleva this se refiere ala clase
        if (leather_seats == "si"){
            this.leatherSeats = true;
        }else{
            this.leatherSeats = false;
        }
    }

    public String say_leather_seats(){ // GETTER
        // Aqui no hay otro variable más la de la clase
        if(leatherSeats == true){
            return "The car have leather seats";
        }else{
            return "The car have not leather seats";
        }
    }

    public void configureAirCondition(String airCondition){ // setter
        if (airCondition == "si"){
            this.airCondition = true;
        } else {
            this.airCondition = false;
        }
    }

    public String getterAirCondition(){ //getter
        if(airCondition == true){
            return "The car have air condition";
        } else {
            return " The car have not air condition";
        }
    }

    public String sayWeightPlataform(){ // Setter y getter
        int bodyWeight = 500;
        weighTotal = weightPlataform + bodyWeight; //setter
        if(leatherSeats == true){
            weighTotal += 50;
        }
        if(airCondition == true){
            weighTotal = weightPlataform + 20;
        }
        return "The weight of the car is " + weighTotal;//getter
    }

    public int priceCar(){ // Es getter porque no estamos tomando ninguna variable de clase
        int priceFinal= 10000;

        if(leatherSeats == true){
            priceFinal += 2000;
        }
        if(airCondition ==true){
            priceFinal +=1500;
        }
        return priceFinal;
    }
}
