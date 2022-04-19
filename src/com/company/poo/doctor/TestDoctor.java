package com.company.poo.doctor;
import com.company.poo.doctor.model.Doctor;
import com.company.poo.doctor.model.Patient;
import com.company.poo.doctor.model.User;

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

        Patient patient= new Patient("Ulisses","ulisses@gmail.com");
        Patient patient2= new Patient("Diego","diego@gmail.com");

        System.out.println(patient);







    }
}
