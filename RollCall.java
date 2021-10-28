package com.company.ClassAssignments;

class User{

    String name;
    int rollNumber;
    String interestField;

    public User(String name, int rollNumber, String interestField) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.interestField = interestField;
    }

    @Override
    public String toString() {
        return "Hey, my name is " + name +
                ", and my roll number is " + rollNumber +
                ". My field of interest is " + interestField + ".";
    }
}

public class RollCall {
    public static void main(String[] args) {
        User user = new User("Lucas Uzoka",007,"Information Technology");

        System.out.println(user);
    }

}
