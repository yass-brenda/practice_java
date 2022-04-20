package com.company.poo.doctor.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;

    public Doctor(String name, String email){
        super(name, email);
        this.speciality = speciality;
        System.out.println("Name : " +name);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(String date,String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return  availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Speciality : " + speciality + "\nAvailable: " +availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Doctor: Cruz verde");
        System.out.println("Departamento: Emergencias");
    }

    public static class AvailableAppointment {
        private int idAvailableAppointment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        public AvailableAppointment(String date,String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getIdAvailableAppointment() {
            return idAvailableAppointment;
        }

        public void setIdAvailableAppointment(int idAvailableAppointment) {
            this.idAvailableAppointment = idAvailableAppointment;
        }

        public String getDate(String Date) {
            return format.format(date);
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "date=" + date + ", time='" + time ;
        }
    }
}
