package com.company.poo;

public class Furgoneta extends Car {
    private int extraAbiliti;
    private int eXtraPlaces;

    public Furgoneta(int extraAbiliti,int eXtraPlaces){
        super();
        this.extraAbiliti = extraAbiliti;
        this.eXtraPlaces =eXtraPlaces;
    }

    public String getDataFurgoneta(){
        return " The capacity of load is " + extraAbiliti +" y the places are: " +eXtraPlaces;
    }
}
