package com.company.poo.book_score;

import java.util.Scanner;

public class BookScore {

    private String nameCourse;

    public BookScore(String name){
        nameCourse = name;
    }

    public void printMessage(){
        System.out.printf("Welcome the book score for \n%s!\n",nameCourse);
    }

    public void setNameCourse(String name){
       nameCourse = name;
    }

    public String getNameCourse(){
        return nameCourse;
    }

    public void determinateScoreclass(){
        Scanner sc = new Scanner(System.in);

        int total;
        int countScore;
        int score;
        int promedio;

        total = 0;
        countScore = 1;

        while (countScore <= 10){
            System.out.println("Write the score: ");
            score = sc.nextInt();
            total = total + score;
            countScore = countScore + 1;
        }

        promedio = total / 10;

        System.out.printf("\nEl total de las 10 caliﬁcaciones es %d\n", total);
        System.out.printf( "El promedio de la clase es %d\n", promedio );
    }

}
