package com.geek.design.patterns.solid.liskov.substitution.solution.vehicles;

public class Bicycle extends Vehicle {

    @Override
    public Integer getNumberOfWheels() {
        return 2;
    }

}
