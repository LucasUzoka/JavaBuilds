package com.company.ClassAssignments;

class Averages{

    final int n = 3;

    void calculate(int num1, int num2, int num3){
        System.out.println((num1 + num2 + num3)/n);
    }
}

public class AverageOfThree {
    public static void main(String[] args) {

        Averages averages = new Averages();
        averages.calculate(100,60,470);

    }

}
