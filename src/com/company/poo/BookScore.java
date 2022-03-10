package com.company.poo;

public class BookScore {

    private String nameCourse;

    public void printMessage(){
        System.out.printf("Welcome the book score for \n%s!\n",nameCourse);
    }

    public void setNameCourse(String name){
       nameCourse = name;
    }

    public String getNameCourse(){
        return nameCourse;
    }

}
