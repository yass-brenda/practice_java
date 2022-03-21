package com.company.poo.bill;

import java.util.Scanner;

public class TestBill {
    public static void main(String[] args){
        Bills bills = new Bills(50.00);
        Bills bills2 = new Bills(-7.53);

        System.out.printf("Salary bill1 : $%.2f\n",bills.getSalary());
        System.out.printf("Salary bill12 : $%.2f\n",bills2.getSalary());

        Scanner sc = new Scanner(System.in);
        double amountCredit;

        System.out.print("Writting the amout to deposit for bill2 ");
        amountCredit = sc.nextDouble();
        System.out.printf("\nsumando %.2f al saldo de cuenta1 \nPrcaticing \n",amountCredit);
        bills2.pay(amountCredit);

        System.out.printf("Salary bill1 : $%.2f\n",bills.getSalary());
        System.out.printf("Salary bill12 : $%.2f\n",bills2.getSalary());

        System.out.print("Writting the amout to deposit for bill1 ");
        amountCredit = sc.nextDouble();
        System.out.printf("\nsumando %.2f al saldo de cuenta1 \n\n",amountCredit);
        bills.pay(amountCredit);

        System.out.printf("Salary bill1 : $%.2f\n",bills.getSalary());
        System.out.printf("Salary bill12 : $%.2f\n",bills2.getSalary());

    }
}
