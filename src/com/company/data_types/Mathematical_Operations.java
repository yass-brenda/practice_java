package com.company.data_types;

public class Mathematical_Operations {
    public static void main(String[] args){
        // double more specific decimals numbers
        double x = 2.1;
        double y= 3;

        // Devuelve une entero redondeado hacia arriba
        System.out.println(Math.ceil(x)); //  2.1 a 3
        // Devuelve un entero hacia abajo
        System.out.println(Math.floor(x)); // 2.1 a 2

        // Devuelve un número elevado a otro número
        System.out.println(Math.pow(x,y));

        // Obtiene el número mayor
        System.out.println(Math.max(x,y));

        // Devuelve la raíz cuadrada
        System.out.println(Math.sqrt(3));

        //Area de un circulo pi +r2
        System.out.println(Math.PI * (Math.pow(y,2)));

        // Area de una esfera 4*PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // Volumen de la esfera (4/3) * pi* r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));


        // Constants
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}
