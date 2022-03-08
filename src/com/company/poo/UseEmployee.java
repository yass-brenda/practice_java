package com.company.poo;
import java.util.*; // for Date


public class UseEmployee {
    public static void main(String[] args){
        /*Employee employee1 = new Employee("Ulisses",120,2020,8,5);
        Employee employee2 = new Employee("Diego",150,2020,8,7);
        Employee employee3 = new Employee("Barrios",1200,2020,12,5);

        employee1.setIncreaseSalary(5);
        employee2.setIncreaseSalary(5);
        employee3.setIncreaseSalary(5);

        System.out.println("Name : " + employee1.getName() + " Salary : " + employee1.getSalary()
                           + " Hight contrat: " + employee1.getDate());

        System.out.println("Name : " + employee2.getName() + " Salary : " + employee2.getSalary()
                + " Hight contrat: " + employee2.getDate());

        System.out.println("Name : " + employee3.getName() + " Salary : " + employee3.getSalary()
                + " Hight contrat: " + employee3.getDate()); */

        Employee[] myEmployess = new Employee[3]; // Array of one class.
        myEmployess[0] = new Employee("Ulisses",120,2020,8,5);
        myEmployess[1] = new Employee("Diego",150,2020,8,7);
        myEmployess[2] = new Employee("Barrios",1200,2020,12,5);

        for (Employee e: myEmployess){
            e.setIncreaseSalary(5);
        }

        /* for (int i = 0;i < myEmployess.length; i++){
            System.out.println("Name : " + myEmployess[i].getName() + " Salary : " + myEmployess[i].getSalary()
                    + " Hight contrat: " + myEmployess[i].getDate());
        }*/

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