package com.geek.design.patterns.creational.prototype.solution;

public class Client {

    public static void main(String[] args) {
        Student student = new Student(20, 101, "Shivam");
        System.out.println("Student : " + student);

        Student studentClone = student.cloneObject();
        System.out.println("Cloned Student : " + studentClone);

        System.out.println("**********************************");

        StudentClonable studentClonable = new StudentClonable(40, 404, "Raj");
        System.out.println("Student : " + studentClonable);

        StudentClonable clonedStudent = studentClonable.clone();
        System.out.println("Cloned Student : " + clonedStudent);
    }
}
