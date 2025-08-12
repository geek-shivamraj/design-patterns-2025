package com.geek.design.patterns.creational.prototype.problem;

public class Client {

    public static void main(String[] args) {
        Student student = new Student(20, 101, "Shivam Raj");
        System.out.println("Student : " + student);

        /**
         * Problems:
         *  1. Client has to create a student clone with all the properties (will be complex in case of 100s of properties)
         *  2. Suppose out of 100s of properties, only 50 properties are allowed to be cloned.
         *  2. In case some attributes are private then the client can't access directly (in case no getters provided)
         */
        Student studentClone = new Student();
        studentClone.age = student.age;
        //studentClone.rollNumber = student.rollNumber;       // This line is the problem as rollNumber is private
        studentClone.name = student.name;
        System.out.println("Cloned Student : " + studentClone);

    }
}
