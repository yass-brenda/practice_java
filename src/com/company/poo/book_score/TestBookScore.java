package com.company.poo.book_score;

import java.util.Scanner;

public class TestBookScore {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        BookScore bookScore = new BookScore("Programación");
        bookScore.printMessage();

        bookScore.printMessage();
        bookScore.determinateScoreclass();
    }
}
