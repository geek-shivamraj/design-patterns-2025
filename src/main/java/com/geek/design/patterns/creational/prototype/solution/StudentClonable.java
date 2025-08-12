package com.geek.design.patterns.creational.prototype.solution;

import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Not Recommended becoz of below reasons
 * 1. Limited to default field-by-field copy that Object.clone() provides.
 * 2. Object.clone() returns Object type & client has to always cast it.
 * 3. With Cloneable, we need to call super.clone() & handle the exceptions.
 * 4. Cloneable just provides a way to copy, not manage prototype.
 * 5. Cloneable is one-size-fit-all approach that might not be appropriate for all the use cases.
 */
@ToString
@NoArgsConstructor
public class StudentClonable implements Cloneable {
    int age;
    private int rollNumber;
    String name;

    StudentClonable(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public StudentClonable clone() {
        try {
            StudentClonable clone = (StudentClonable) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.rollNumber = rollNumber;
            clone.name = name;
            clone.age = age;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
