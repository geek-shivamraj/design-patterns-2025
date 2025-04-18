package com.geek.design.patterns.solid.liskov.substitution.problem.vehicles;

public class Car extends Vehicle {

    public Integer accelerate() {
        // Increase the speed
        return getSpeed() + 10;
    }
}
