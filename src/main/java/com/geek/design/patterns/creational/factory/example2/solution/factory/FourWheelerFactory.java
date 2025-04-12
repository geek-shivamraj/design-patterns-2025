package com.geek.design.patterns.creational.factory.example2.solution.factory;

import com.geek.design.patterns.creational.factory.example2.FourWheeler;
import com.geek.design.patterns.creational.factory.example2.Vehicle;

public class FourWheelerFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
