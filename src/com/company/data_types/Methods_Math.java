package com.company.data_types;

public class Methods_Math {
    public static void main(String args[]){
        // Math nos permite realizar cálculos matemáticos.
        //Math .sqrt(n),.pow(base,exponente) , Math.sin(angulo) , Math.PI

        //Sqrt
        double raiz = Math.sqrt(25);
        System.out.println(raiz);

        // Round
        double num1 = 5.85;
        int result = (int)Math.round(num1);
        System.out.println(result);

        //Pow
        double base = 5;
        double exponente = 3;
        int result_pow = (int) Math.pow(base,exponente);
        System.out.println("The result of "+ base +" raised to" + exponente+ " is " + result_pow);


    }
}
