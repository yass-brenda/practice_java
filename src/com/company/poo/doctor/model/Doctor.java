package com.company.poo.doctor.model;

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
    public void addAvailableAppointment(Date date,String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return  availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Speciality : " + speciality + "\nAvailable: " +availableAppointments.toString();
    }

    public static class AvailableAppointment {
        private int idAvailableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date,String time){
            this.date = date;
            this.time = time;
        }

        public int getIdAvailableAppointment() {
            return idAvailableAppointment;
        }

        public void setIdAvailableAppointment(int idAvailableAppointment) {
            this.idAvailableAppointment = idAvailableAppointment;
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
