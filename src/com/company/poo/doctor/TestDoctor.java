package com.company.poo.doctor;
import com.company.poo.doctor.model.*;

import java.util.Date;


public class TestDoctor {
    public static void main(String[] args){
        Doctor doctor = new Doctor("Ulisses", "Farmer");
        doctor.addAvailableAppointment(new Date(),"4pm");
        doctor.addAvailableAppointment(new Date(),"5pm");
        doctor.addAvailableAppointment(new Date(),"6pm");
        System.out.println(doctor);

        /*
        for(Doctor.AvailableAppointment a : doctor.getAvailableAppointments()){
            System.out.println(a.getDate() + " " + a.getTime());
        } */

        User user = new Doctor("Ulisses","ule@gmail.com"); // Polimorfismo.
        user.showDataUser();

        User user2 = new Patient("Gloria","gloria@gmail.com"); // Polimorfismo.
        user2.showDataUser();

        // Instancia de un metodo acceso anonimo
        User user3 = new User("Ulisses","ule@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital cruz morada");
                System.out.println("Departamento: Geriatria");
            }
        };

        user3.showDataUser();
        ISchedulable iSchedulable =new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
        ISchedulable iSchedulable1 = new AppointmentDoctor();


        /*
        Patient patient= new Patient("Ulisses","ulisses@gmail.com");
        Patient patient2= new Patient("Diego","diego@gmail.com");

        System.out.println(patient); */







    }
}
