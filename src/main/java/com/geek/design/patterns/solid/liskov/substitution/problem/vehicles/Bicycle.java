package com.geek.design.patterns.solid.liskov.substitution.problem.vehicles;

public class Bicycle implements Bike {

    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }

    @Override
    public void accelerate() {
        // do something
    }
}
