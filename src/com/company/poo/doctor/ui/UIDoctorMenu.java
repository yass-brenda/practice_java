package com.company.poo.doctor.ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctor(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome" + UIMenu.doctorLogged);
            System.out.println("1.Add available Appointment");
            System.out.println("2.My scheduled appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response!=0);

    }

    private static void showAddAvailableAppointment(){
        int response =0;
        do{
            System.out.println();
            System.out.println("::Add Available Apointment");
            System.out.println("::Select a Month");

            for(int i = 0; i< 3; i++){
                int j = i + 1;
                System.out.println(j + ". "+    UIMenu.MONTHS[i]);
            }
            System.out.println("0. Rerurn");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response > 0 && response < 4){
                int monthSelected = response;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected]);

                System.out.println("Insert the date available: [dd/mm//yy]");
                String date = sc.next();

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change Date ");

            } else if(response == 0){
                showDoctor();

            }
        }while(response !=0);
    }
}
