package com.company.data_types;

public class Variabls {
    public static void main(String[] args){
        // Declaration
        int speed;
        // Asignation
        speed = 10;
        System.out.println(speed);

        // Declaration and asignation
        int salary = 1000;
        System.out.println(salary);


        String name = "Ulisses";
        System.out.println(name);

        char letter ='U';
        System.out.println(letter);

        boolean option = true;
        System.out.println(option);

        double number = 10.0;
        System.out.println(number);


        // Use of var in numeric number version 10 ++
        var salaryWork = 1000; // int
        var pension = salaryWork * 0.3; // double
        var totalSalary = salaryWork - pension;
        System.out.println(salaryWork);
        System.out.println(pension);
        System.out.println(totalSalary);

        // Use var in string data  version 10 ++
        var employeName = "Diego Ulisses";
        System.out.println("Employee" + employeName + " your salary is: " + totalSalary);
    }
}
