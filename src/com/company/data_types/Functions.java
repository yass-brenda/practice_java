package com.company.data_types;

public class Functions {
    public static void main(String[] args) {
        double y = 3;

        double area = circulArea(y);
        System.out.println(area);

        System.out.println(sphereArea(y));

        System.out.println(sphereVolumen(y));
        System.out.println("The result is: " + converToDolar(120.0,"MXN"));


    }

    // The functions should a level of class.

    /**
     * Description: Calculate the area of circle.
     * @param r is the radius of circle
     * @return circle area in double
     */
    public static double circulArea(double r) {
        return Math.PI * (Math.pow(r, 2));
    }

    /**
     * Description: Calculate the sphere area.
     * @param r is the radius of sphere
     * @return sphere area in double
     */
    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    /**
     * Description: Calculate the sphere volume.
     * @param r is the radius of sohere
     * @return sphere volume in double
     */
    public static double sphereVolumen(double r) {
        return ((4 / 3) * Math.PI * Math.pow(r, 3));
    }

    /**
     * Description : Function what specific your coin convert to quantity of money
     * @param quantity Quantity of money
     * @param currency TYpe of coin : ONly accept MXN o COP
     * @return quantity return the quantity update  in double
     **/
    public static double converToDolar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "OCP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;

    }
}
