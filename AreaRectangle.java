package com.company.ClassAssignments;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {

        double length;
        double breath;
        //double area = a;


        Scanner scanner = new Scanner(System.in);

        System.out.println("**Find The Area of A Rectangle**");

        System.out.println("Enter the length: ");
        length = scanner.nextDouble();
        System.out.println("Enter the breath: ");
        breath = scanner.nextDouble();

        System.out.println("The Area of this Rectangle is: ");
        System.out.println(length * breath + " square centimeters");

    }
}
