package com.geek.design.patterns.creational.prototype.problem;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class Student {
    int age;
    private int rollNumber;
    String name;

    Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }
}
