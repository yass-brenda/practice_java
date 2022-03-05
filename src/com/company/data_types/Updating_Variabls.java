package com.company.data_types;

public class Updating_Variabls {
    public static void main(String[] args){
        int salary = 1000;
        salary +=200;
        System.out.println(salary);

        salary -=50;
        System.out.println(salary);

        salary =salary + (30*2) -45 ;
        System.out.println(salary);

        String employeeName = "Diego Ulisses";
        employeeName += " Barrios";
        System.out.println(employeeName);
        employeeName += " Becerra";

        System.out.println("Your name is " + employeeName); // concatrnation
    }
}
