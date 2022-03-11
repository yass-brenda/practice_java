package com.company.poo;

public class Bills {

    private double salary;

    public Bills(double salaryInitial){
        if (salaryInitial > 0.0){
            salary = salaryInitial;
        }
    }

    public void pay(double amount){
        salary =  salary + amount;
    }

    public double getSalary() {
        return salary;
    }
}
