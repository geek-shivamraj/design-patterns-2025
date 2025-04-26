package com.geek.design.patterns.creational.factory.example1.vehicle.with.factory.creator.concrete;

import com.geek.design.patterns.creational.factory.example1.vehicle.with.factory.creator.VehicleFactory;
import com.geek.design.patterns.creational.factory.example1.vehicle.with.factory.product.Vehicle;
import com.geek.design.patterns.creational.factory.example1.vehicle.with.factory.product.concrete.ThreeWheeler;

public class ThreeWheelFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new ThreeWheeler();
    }
}
