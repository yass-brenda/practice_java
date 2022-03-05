package com.company.data_types;

public class PracticingUnitOne {
    public static void main(String[] args){
        String mother = "Gloria";
        String parentMother = "mom";
        int ageMother = 48;
        double weigth = 1.60;

        String father = "Osvaldo";
        String parentFather = "dad";
        int ageFather = 49;
        double weigthFather = 1.62;


        String brother = "Ulisses";
        String parentBrother = "brother";
        int ageBrother = 19;
        double weigthBrother = 1.82;

        System.out.println("My " + parentMother + " is " + mother + " and your age is " + ageMother + " and your weight is " + weigth );
        System.out.println("My " + parentFather + " is " + father + " and your age is " + ageFather + " and your weight is " + weigthFather );
        System.out.println("My " + parentBrother + " is " + brother + " and your age is " + ageBrother + " and your weight is " + weigthBrother );

        char c = 'z';
        int i = 250;
        double d = 301.067;

        int convertC = c;  //Automatic accurancy
        System.out.println(convertC);

        long convertI = i; //Automatic accurancy
        System.out.println(convertI);

        short convertS = (short) i;// Manual estimation
        System.out.println(convertI);

        long convertD = (long) d; //Manual accurancy

        i = 100 + (int)5000.66;  //Manual estimation
        System.out.println((float)i);

        i= 737 * 100; //Manual estimation
        System.out.println((byte)i);

        d = 298.638/25; //Manual accurancy
        System.out.println((long)d);




    }
}
