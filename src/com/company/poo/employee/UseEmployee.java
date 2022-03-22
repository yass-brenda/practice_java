package com.company.poo.employee;
import java.util.*; // for Date


public class UseEmployee {
    public static void main(String[] args){

        Jefatura jefatura = new Jefatura(" Diego Ulisses",4,2020,8,5);
        jefatura.setIncentive(30.0);

        Employee[] myEmployess = new Employee[6]; // Array of one class.
        myEmployess[0] = new Employee("Ulisses",1,2020,8,5);
        myEmployess[1] = new Employee("Diego",2,2020,8,7);
        myEmployess[2] = new Employee("Barrios",3,2020,12,5);
        myEmployess[3] = new Employee("Becerra");

        myEmployess[4] = jefatura; //Polimorfismo. Principo de sustitución.
        myEmployess[5] = new Jefatura(" Gloria",5,2020,8,5);

        double num1 = 7.5;
        int num2 = (int) num1;

        // Un jefe es un empleado .
        Jefatura jefaDeploy = (Jefatura)myEmployess[5];
        jefaDeploy.setIncentive(5000);

        System.out.println(jefaDeploy.takeDecisions("Shopping more food"));

        /* Un empleado no es un jefe
        Jefatura jefeShop = (Jefatura) myEmployess[1]; */

        /* Interfaces
        Employee directorComercial = new Jefatura("Gloria",400,1998,05,02);
        Comparable ejemplo = new Employee("Osvaldo",300,1997,04,01);

        if(directorComercial instanceof Employee){
            System.out.println("Is of type jefatura");
        }

        if(ejemplo instanceof Comparable){
            System.out.println("Is of type comparable");
        } */


        for (Employee e: myEmployess){
            e.setIncreaseSalary(5);
        }

        Arrays.sort(myEmployess);

        for (Employee e: myEmployess){
            System.out.println("Name : " + e.getName() + " Salary : " + e.getSalary() + " Hight contrat: " + e.getDate());
        }

    }
}

class Employee implements Comparable {
    public Employee(String name,double salary,int year,int month,int day){
        nameEmployee = name;
        salaryEmployee = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        highContrat = calendar.getTime();
    }

    public Employee(String name){
       //Constriuir objetos de los que se desconoce  algun dato y que esos datos sean iguales
        //Ese this llama al otro constructor de la clase  si tiene smás constructores llamara al que coincida con el mismo numero de parametros
        this(name,3000,2000,01,01);
    }

    public String getName(){
        return nameEmployee;
    }

    public double getSalary(){
        return salaryEmployee;
    }

    public Date getDate(){
        return highContrat;
    }

    public void setIncreaseSalary(double percentage){
        double increase = salaryEmployee * percentage /100;
        salaryEmployee+= increase;
    }

    public int compareTo(Object myObject){
        Employee otherEmploye = (Employee) myObject;
        if(this.salaryEmployee < otherEmploye.salaryEmployee){
            return -1;
        }
        if(this.salaryEmployee > otherEmploye.salaryEmployee){
            return 1;
        }

        return 0;
    }

    private String nameEmployee;
    private double salaryEmployee;
    private Date highContrat; // No is  data type primitiv
    private int Id;
    private static int idNext = 1;
}

class Jefatura extends Employee implements Jefes{
    public Jefatura(String nom, double sal,int agno,int month, int day){
        super(nom,sal,agno,month,day); // Dependiendo de los parametros que pase llamara a un constructor o a otro, buscará .
    }

    public void setIncentive(double b){
        incentive = b;
    }

    public double getSalary(){
        double salaryBoss = super.getSalary();
        return salaryBoss + incentive;
    }

    private double incentive;

    @Override
    public String takeDecisions(String decision) {
        return "One decision was take"+ decision;
    }
}

