package com.company.poo;
import static com.company.poo.UIMenu.*; // Add import for static

import javax.print.Doc;

public class TestDoctor {
    public static void main(String[] args){
        Doctor doctor = new Doctor("Ulisses");
        doctor.name ="Ulisses";
        doctor.showName();
        doctor.showId();


        Doctor myDoctorUle = new Doctor("Diego");
        myDoctorUle.showId();

        // UIMenu.showMenu();
        showMenu();
    }
}
