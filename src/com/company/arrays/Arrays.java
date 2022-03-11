package com.company.arrays;

public class Arrays {
    public static void main(String[] args){
        String[] androidVersions = new String[17];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Red";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for(int i = 0; i< androidVersions.length ; i++){
            System.out.println(androidVersions[i]);
        }

        for (String androidV: androidVersions) {
            System.out.println(androidV);
        }

        System.out.println();
        System.out.println();

        /*System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);*/


        System.out.println();
        System.out.println();

        String days[] = new String[7];

        // country city
        // Mexico  CDMX
        // 4 renglones 2 colummnas = 4*2 = 8 dimensiones
        String[][] cities = new String[4][2];
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Medellín";
        cities[3][1] = "CDMX";

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

        System.out.println();
        System.out.println();

        for (int i = 0; i< cities.length -1; i++){ //renglones
            for (int j = 0; j < cities.length; j++){
                System.out.println(cities[i][j]);
            }
        }



        int[][][] numbers = new int[2][2][2];
        // renglon, columns , elementos, elementos
        String [][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println();
        System.out.println();

        System.out.println( animals[1][0][0][1]);

        for (int i =0;i<= 1;i++){
            for (int j =0; j<= 1;j++){
                for (int k =0;k<= 1;j++){
                    for (int l =0;l<= 1;l++){
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }



    }
}

