package com.geek.design.patterns.behavioral.strategy.example1.vehicle.withstrategy;

import com.geek.design.patterns.behavioral.strategy.example1.vehicle.withstrategy.strategy.SportsDriveStrategy;

public class GoodsVehicle extends VehicleContext {
    public GoodsVehicle() {
        super(new SportsDriveStrategy());
    }
}
