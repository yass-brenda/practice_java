package com.company.poo;

import java.util.Scanner;

public class TestBookScore {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        BookScore bookScore = new BookScore();

        System.out.printf("Writte the name of course is: %s\n\n", bookScore.getNameCourse());

        System.out.printf("Writte the name of course:");
        String nameCourse = sc.nextLine();
        bookScore.setNameCourse(nameCourse);
        System.out.println();


        bookScore.printMessage();
    }
}
