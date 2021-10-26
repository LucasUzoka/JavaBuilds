package com.company.WeekTwo;

import java.util.Scanner;

// Calculator Homework - Week 2 (Monday)

public class ClassWork1 {
    public static void main(String[] args) {

        char options;
        int output;
        int numA;
        int numB;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Your Math Task: +(to add) -(to minus) /(to divide) *(to multiply)"+ "\n");
        options = scanner.next().charAt(0);

        System.out.println("Enter Number A");
        numA = scanner.nextInt();
        System.out.println("Enter Number B");
        numB = scanner.nextInt();


        switch (options) {
            case '+' -> {
                output = numA + numB;
                System.out.println("RESULT: " + output);
            }

            case '-' -> {
                output = numA - numB;
                System.out.println("RESULT: " + output);
            }

            case '/' -> {
                output = numA / numB;
                System.out.println("RESULT: " + output);
            }

            case '*' -> output = numA * numB;

            default -> System.out.println("Illegal Operation Attempted");
        }


    }
}

