package com.geek.design.patterns.creational.factory.example1.vehicle.with.factory;

import com.geek.design.patterns.creational.factory.example1.vehicle.with.factory.creator.VehicleFactory;
import com.geek.design.patterns.creational.factory.example1.vehicle.with.factory.product.Vehicle;

public class VehicleClientService {

    private final Vehicle vehicle;

    public VehicleClientService(VehicleFactory vehicleFactory) {
        this.vehicle = vehicleFactory.createVehicle();
    }

    public void useVehicle() {
        // Some logic
        vehicle.printVehicle();
        // Some logic
    }
}
