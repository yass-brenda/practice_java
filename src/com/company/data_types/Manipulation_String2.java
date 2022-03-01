package com.company.data_types;

public class Manipulation_String2 {
    public static void main (String args []){
        String phrase = "Ulisses Barrios don not forget";
        String phrase_resume = phrase.substring(16) + " Ulisses";

        System.out.println("First phrase: " + phrase);
        System.out.println("Second phrase: " + phrase_resume);

        System.out.println(phrase.equals(phrase_resume));

        String name = "Ulisses Barrios";
        String fullName = "ulisses Barrios";

        System.out.println("Name: " + name);
        System.out.println("Full name: " + fullName);

        System.out.println(name.equalsIgnoreCase(fullName));
    }
}

