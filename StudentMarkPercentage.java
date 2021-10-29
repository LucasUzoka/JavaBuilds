package com.company.ClassAssignments;

abstract class Marks{
    abstract void getPercentage();
}

class MarkA extends Marks{

    double aBiology;
    double aChemistry;
    double aPhysics;

    public MarkA(double aBiology, double aChemistry, double aPhysics) {
        this.aBiology = aBiology;
        this.aChemistry = aChemistry;
        this.aPhysics = aPhysics;
    }

    @Override
    void getPercentage() {
        System.out.println("Student A Marks");
        System.out.println("Biology: " + aBiology + "%" +" Chemistry: " + aChemistry + "%" + " Physics: "
                + aPhysics + "%");
    }
}

class MarkB extends Marks{
    double bBiology;
    double bChemistry;
    double bPhysics;
    double bGeology;

    public MarkB(double bBiology, double bChemistry, double bPhysics, double bGeology) {
        this.bBiology = bBiology;
        this.bChemistry = bChemistry;
        this.bPhysics = bPhysics;
        this.bGeology = bGeology;
    }

    @Override
    void getPercentage() {
        System.out.println("Student B Marks");
        System.out.println("Biology: " + bBiology + "%" +" Chemistry: " + bChemistry + "%" + " Physics: "
                + bPhysics + "%" + " Geology: " + bGeology + "%");
    }
}

public class StudentMarkPercentage {
    public static void main(String[] args){
        MarkA studentA = new MarkA(50,60,80);
        MarkB studentB = new MarkB(10,20,30,40);

        studentA.getPercentage();
        studentB.getPercentage();
    }
}
