package com.company.paquete;

public class Declaration_Operators {
    public static void main(String args[]){
        final double ainch = 2.54;
        double cm = 6 ;
        double result = cm / ainch;
        System.out.println("In " + cm + " cm have " + result + " inch" );

        int a = 5;
        int  b;
        b = 7;

        int c = b + a;
        double d = b / a;

        c++;
        c-=2;


        System.out.println(c);
        System.out.println(ainch);
    }
}
