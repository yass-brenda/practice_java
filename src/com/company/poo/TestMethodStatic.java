package com.company.poo;

public class TestMethodStatic {
    public static void main(String[] args){
        Empl employes1 = new Empl("Ulisses");
        Empl employes2 = new Empl("Diego");
        Empl employes3 = new Empl("Barrios");


        System.out.println(employes1.getData() + "\n" + employes2.getData() );

        employes2.setNameEmpl("Programming");
        employes2.getData();
        System.out.println(employes2.getData());
        System.out.println(employes3.getData());

        System.out.println(Empl.returnIdNext());
    }
}


class Empl{

    public Empl(String nom){
        nameEmpl = nom;
        section = "management";
        id  = idNext;
        idNext++;
    }

    private final String nameEmpl;
    private String section;
    private int id;
    private static int idNext = 1;

    public static String returnIdNext(){
        return "The next id is: " + idNext;
    }

    public void setNameEmpl(String section){
        this.section = section;
    }

    public String getData(){
        return "The name is: " + nameEmpl + " y la section is " + section + " and the is is: " + id;
    }

    public void changeName(String name){
        //this.name = name;
    }
}