package com.geek.design.patterns.creational.prototype.solution;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Builder
public class Student implements Prototype<Student> {
    int age;
    private int rollNumber;
    String name;

    // Parameterized Constructor
    Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Copy Constructor
    public Student(Student original) {
        this.age = original.age;
        this.rollNumber = original.rollNumber;
        this.name = original.name;
    }

    @Override
    public Student cloneObject() {

        // i. Use parameterized constructor when you have individual values to initialize the object
        Student way1 = new Student(this.age, this.rollNumber, this.name);

        // ii. Use copy constructor when you want to create a new object that's a copy of an existing one
        Student way2 = new Student(this);

        // iii. Initializing each attribute using this operator
        Student way3 = new Student();
        way3.age = this.age;
        way3.rollNumber = this.rollNumber;
        way3.name = this.name;

        // iv. Builder Design Pattern
        Student way4 = Student.builder().age(this.age).rollNumber(this.rollNumber).name(this.name).build();

        return way4;
    }

}
