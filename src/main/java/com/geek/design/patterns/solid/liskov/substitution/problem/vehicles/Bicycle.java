package com.geek.design.patterns.solid.liskov.substitution.problem.vehicles;

public class Bicycle extends Vehicle {

    @Override
    public Boolean hasEngine() {
        return null;
    }

    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }

    public Integer accelerate() {
        return null;
    }
}
