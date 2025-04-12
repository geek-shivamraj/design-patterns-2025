package com.geek.design.patterns.creational.factory.example2.solution.factory;

import com.geek.design.patterns.creational.factory.example2.ThreeWheeler;
import com.geek.design.patterns.creational.factory.example2.Vehicle;

public class ThreeWheelerFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new ThreeWheeler();
    }
}
