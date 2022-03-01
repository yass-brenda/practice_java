package com.company.data_types;

public class Manipulation_String {

    public static void main(String args []){
        String name = "Ulisses Barrios";
        System.out.println("My brother is: " + name);
        System.out.println("The length of the name is: " + name.length());
        System.out.println("The name begins with the letter: " + name.charAt(0));
        System.out.println("The name has these letters: " + name.substring(3,6));
        System.out.println("The last letter is: " + name.substring(name.length()-1));
    }
}
