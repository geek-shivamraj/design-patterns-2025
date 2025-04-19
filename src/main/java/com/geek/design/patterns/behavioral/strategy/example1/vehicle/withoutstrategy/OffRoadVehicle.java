package com.geek.design.patterns.behavioral.strategy.example1.vehicle.withoutstrategy;

public class OffRoadVehicle extends Vehicle {

    @Override
    public void drive() {
        // different drive logic
        System.out.println("Without Strategy: Sports Drive Capability");
    }
}
