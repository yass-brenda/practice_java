package com.company.poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsePeople {
    public static void main(String[] args){
        People[] peoples = new People[2];
        peoples[0] = new Employee2("Ulisses",120,2020,8,5);
        peoples[1] = new Student("Diego","Computación");

        for(People people: peoples){
            System.out.println(people.getName() + ", " + people.getDescription() );
        }

    }
}

abstract class People {
    private String name;

    public People(String name){
        this.name  = name;
    }

    public String getName(){
        return name;
    }

    public abstract String getDescription();
}

class Employee2 extends People {
    public Employee2(String name,double salary,int year,int month,int day){
        super(name);
        salaryEmployee = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        highContrat = calendar.getTime();
        Id =idNext;
        idNext++;

    }

    public double getSalary(){
        return salaryEmployee;
    }

    public Date getDate(){
        return highContrat;
    }

    public void setIncreaseSalary(double percentage){
        double increase = salaryEmployee * percentage /100;
        salaryEmployee+= increase;
    }

    private double salaryEmployee;
    private Date highContrat;
    private int Id;
    private static int idNext = 1;

    @Override
    public String getDescription() {
        return " This employe have a Id= " + Id + " your salary is: " + salaryEmployee;
    }
}

class Student extends People{

    public Student(String name, String profession){
        super(name);
        this.profession = profession;
    }

    @Override
    public String getDescription() {
        return "This student is: " + profession;
    }

    private String profession;

}