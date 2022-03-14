package com.company.poo;

public class Doctor {
    static int id = 0; // Autoincrement
    String name;
    String speciality;

    public Doctor(String name){
        System.out.println("Name : " +name);
        id++;
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Id doctor :" +id);
    }
}
