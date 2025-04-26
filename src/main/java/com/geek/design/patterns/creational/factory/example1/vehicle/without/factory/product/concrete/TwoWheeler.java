package com.geek.design.patterns.creational.factory.example1.vehicle.without.factory.product.concrete;

import com.geek.design.patterns.creational.factory.example1.vehicle.without.factory.product.Vehicle;

public class TwoWheeler extends Vehicle {

    @Override
    public void printVehicle() {
        System.out.println("Without Factory: This is Two Wheeler.");
    }
}
