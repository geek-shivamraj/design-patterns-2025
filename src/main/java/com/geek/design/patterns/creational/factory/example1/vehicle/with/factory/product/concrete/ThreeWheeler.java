package com.geek.design.patterns.creational.factory.example1.vehicle.with.factory.product.concrete;

import com.geek.design.patterns.creational.factory.example1.vehicle.with.factory.product.Vehicle;

public class ThreeWheeler extends Vehicle {

    @Override
    public void printVehicle() {
        System.out.println("With Factory: This is Three Wheeler.");
    }
}
