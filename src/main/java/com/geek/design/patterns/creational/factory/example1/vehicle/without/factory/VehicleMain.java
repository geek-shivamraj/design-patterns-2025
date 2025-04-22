package com.geek.design.patterns.creational.factory.example1.vehicle.without.factory;

public class VehicleMain {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService(VehicleType.TWO_WHEELER);
        vehicleService.useVehicle();

        vehicleService = new VehicleService(VehicleType.THREE_WHEELER);
        vehicleService.useVehicle();

        vehicleService = new VehicleService(VehicleType.FOUR_WHEELER);
        vehicleService.useVehicle();

    }
}
