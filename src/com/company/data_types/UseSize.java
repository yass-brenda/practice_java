package com.company.data_types;

import java.util.Scanner;

public class UseSize {

    // Valores a almacenar en esta variable separados por comas.
    // enum Size {MINI,MEDIUM,BIG,EXTRA_BIG};
    enum Size {
        MINI("S"), MEDIUM("M"),BIG("B"),EXTRA_BIG("EX");

        private Size(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation(){
            return abbreviation;
        }

        private String abbreviation;
    }

    public static void main(String[] args){
        /* Size s = Size.MINI;
        Size m = Size.MEDIUM;
        Size b = Size.BIG;
        Size eb =  Size.EXTRA_BIG; */

        Scanner sc = new Scanner(System.in);
        System.out.println("Writting a one size: MINI, MEDIUM,BIG,EXTRA_BIG");
        String input_data = sc.next().toUpperCase();
        Size the_size = Enum.valueOf(Size.class,input_data);
        System.out.println("Size= " + the_size );
        System.out.println("Abbreviation = " + the_size.getAbbreviation());

    }
}
