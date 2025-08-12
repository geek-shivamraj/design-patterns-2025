package com.geek.design.patterns.creational.builder.example2.components;

import com.geek.design.patterns.creational.builder.example2.product.Car;
import lombok.Setter;

@Setter
public class TripComputer {

    private Car car;

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
