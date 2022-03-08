package com.company.data_types;

public class WhileLoop {
    static boolean isTrueOnLight = false;


    public static void main(String[] args){
        turnOnOffLight();

        int i = 1;
        while (isTrueOnLight && i <= 10){
            printSos();
            i++;
        }
    }

    public static void printSos(){
        System.out.println("...___...");
    }

    public static boolean turnOnOffLight(){
        isTrueOnLight = (isTrueOnLight)?  false:true;
        return  isTrueOnLight;
    }
}
