package com.geek.design.patterns.behavioral.strategy.example1.vehicle.withstrategy;

public class Client {
    public static void main(String[] args) {
        VehicleContext vehicleContext = new GoodsVehicle();
        vehicleContext.drive();

        vehicleContext = new OffRoadVehicle();
        vehicleContext.drive();

        vehicleContext = new SportsVehicle();
        vehicleContext.drive();
    }
}
