package com.geek.design.patterns.behavioral.strategy.example1.vehicle.withstrategy;

import com.geek.design.patterns.behavioral.strategy.example1.vehicle.withstrategy.strategy.NormalDriveStrategy;

public class OffRoadVehicle extends VehicleContext {
    public OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
