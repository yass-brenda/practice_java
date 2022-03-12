package com.company.poo;

public class UseFinal {
    public static void main(String[] args){
        Employees employes1 = new Employees("Ulisses");
        Employees employes2 = new Employees("Diego");
        Employees employes3 = new Employees("Barrios");


        System.out.println(employes1.getData());
        System.out.println(employes2.getData());

        employes2.setName("Programming");
        //employes2.changeName("Barrios"); // The name have not changed(Not altered)
        employes2.getData();
        System.out.println(employes2.getData());
        System.out.println(employes2.getData());
    }
}


class Employees{

    public Employees(String nom){
        name = nom; // Si quieres que una variable del constructor no sea modificada durante la ejecución se delara como constante final dentro del constructor.
        section = "management";
        id  = idNext;
        idNext++;
    }

    private final String name;
    private String section;
    private int id;
    private static int idNext = 1; // Solo la clase tiene esta copia de la variable


    public void setName(String section){
        this.section = section;
    }

    public String getData(){
        return "The name is: " + name + " y la section is " + section + " and the is is: " + id;
    }

    public void changeName(String name){
        //this.name = name; // Si ya se le dio nombre en el constructor no puedes asignarlo de nuevo
    }
}