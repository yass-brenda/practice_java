package com.company.poo;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.*; // for Date


public class UseEmployee {
    public static void main(String[] args){

        Employee[] myEmployess = new Employee[4]; // Array of one class.
        myEmployess[0] = new Employee("Ulisses",120,2020,8,5);
        myEmployess[1] = new Employee("Diego",150,2020,8,7);
        myEmployess[2] = new Employee("Barrios",1200,2020,12,5);
        myEmployess[3] = new Employee("Becerra");

        for (Employee e: myEmployess){
            e.setIncreaseSalary(5);
        }

        for (Employee e: myEmployess){
            System.out.println("Name : " + e.getName() + " Salary : " + e.getSalary() + " Hight contrat: " + e.getDate());
        }

    }
}

class Employee {
    public Employee(String name,double salary,int year,int month,int day){
        nameEmployee = name;
        salaryEmployee = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        highContrat = calendar.getTime();
    }

    public Employee(String name){
       //Constriuir objetos de los que se desconoce  algun dato y que esos datos sean iguales
        //Ese this llama al otro constructor de la clase  si tiene smás constructores llamara al que coincida con el mismo numero de parametros
        this(name,3000,2000,01,01);
    }

    public String getName(){
        return nameEmployee;
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

    private String nameEmployee;
    private double salaryEmployee;
    private Date highContrat; // No is  data type primitiv
}