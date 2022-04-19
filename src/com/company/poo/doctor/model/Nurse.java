package com.company.poo.doctor.model;

public class Nurse extends User{
    private String speciallity;

    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpeciallity() {
        return speciallity;
    }

    public void setSpeciallity(String speciallity) {
        this.speciallity = speciallity;
    }
}
