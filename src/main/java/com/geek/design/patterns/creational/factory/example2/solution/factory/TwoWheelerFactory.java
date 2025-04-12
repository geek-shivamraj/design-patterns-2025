package com.geek.design.patterns.creational.factory.example2.solution.factory;

import com.geek.design.patterns.creational.factory.example2.TwoWheeler;
import com.geek.design.patterns.creational.factory.example2.Vehicle;

public class TwoWheelerFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
