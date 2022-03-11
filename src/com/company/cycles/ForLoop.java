package com.company.cycles;

public class ForLoop {
    static boolean isTrueOnLight = false;

    public static void main(String[] args){
        turnOnOffLight();

        for(int i= 1; i<=10; i++){
            printSos();
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
