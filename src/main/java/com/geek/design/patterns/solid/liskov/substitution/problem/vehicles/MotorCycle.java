package com.geek.design.patterns.solid.liskov.substitution.problem.vehicles;

public class MotorCycle implements Bike {
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        // Turn on the engine
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        // Increase the speed
        speed += 10;
    }
}
