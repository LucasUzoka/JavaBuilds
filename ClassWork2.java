package com.company.WeekTwo;

import java.util.Scanner;

public class ClassWork2 {
    public static void main(String[] args) {
        double tenure;
        double emiOutput; //EMI = [P x R x (1+R)^N]/[(1+R)^N-1]
        double amount;
        double intRate;
        Scanner scanner = new Scanner(System.in);

        System.out.println("EMI Calculator App Assignment");

        System.out.println("Loan Amount");
        amount = scanner.nextDouble(); //amount

        System.out.println("RoI");
        intRate = scanner.nextDouble(); //Roi

        System.out.println("Tenure");
        tenure = scanner.nextDouble(); //tenure

        System.out.println("The EMI is: ");
        emiOutput = (amount * intRate * Math.pow(1 + intRate, tenure))/(Math.pow(1+intRate, tenure)-1); //formular https://www.embibe.com/exams/emi-calculator/
        System.out.println(emiOutput);




    }
}
