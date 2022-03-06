package com.company.data_types;

public class LogicsOperation {
    public static void main(String[] args){
        int a= 8;
        int b= 5;


        if(a == b){
            System.out.println("a is equls to b? -> :" + (a == b));
        } else if((a > b) && (a != b)){
            System.out.println("a is  more than b? -> :" + (a > b));
        } else if((a < b) && (a >= b)){
            System.out.println("a is less than b? -> :" + (a < b));
        } else if(a <= b){
            System.out.println("a is less than or equals b? -> :" + (a <= b));
        }

    }
}
