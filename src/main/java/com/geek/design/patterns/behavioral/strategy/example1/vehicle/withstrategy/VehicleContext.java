package com.geek.design.patterns.behavioral.strategy.example1.vehicle.withstrategy;

import com.geek.design.patterns.behavioral.strategy.example1.vehicle.withstrategy.strategy.DriveStrategy;

public class VehicleContext {

    private final DriveStrategy driveStrategy;

    public VehicleContext(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
