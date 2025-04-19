package com.geek.design.patterns.behavioral.strategy.example1.vehicle.withstrategy;

import com.geek.design.patterns.behavioral.strategy.example1.vehicle.withstrategy.strategy.SportsDriveStrategy;

public class SportsVehicle extends VehicleContext {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
