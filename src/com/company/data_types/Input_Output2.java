package com.company.data_types;

import java.util.Scanner;

public class Input_Output2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Add your name:  ");
        String name_user = sc.nextLine();
        System.out.println("Add your age:  ");
        int age_user = sc.nextInt();
    }
}
