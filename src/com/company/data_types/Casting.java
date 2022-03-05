package com.company.data_types;

public class Casting {
    public  static  void main(String[] args){

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        // Estimation big data to small data in this case any decimal are losts.
        int estimatedMonthlyDogs = (int)monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        // Accurandy for more specific decimals
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);


    }
}
