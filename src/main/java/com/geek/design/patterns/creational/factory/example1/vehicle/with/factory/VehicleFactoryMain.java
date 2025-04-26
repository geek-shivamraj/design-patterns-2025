package com.geek.design.patterns.creational.factory.example1.vehicle.with.factory;

import com.geek.design.patterns.creational.factory.example1.vehicle.with.factory.creator.concrete.FourWheelFactory;
import com.geek.design.patterns.creational.factory.example1.vehicle.with.factory.creator.concrete.ThreeWheelFactory;
import com.geek.design.patterns.creational.factory.example1.vehicle.with.factory.creator.concrete.TwoWheelFactory;

public class VehicleFactoryMain {

    public static void main(String[] args) {
        VehicleClientService vehicleClientService = new VehicleClientService(new TwoWheelFactory());
        vehicleClientService.useVehicle();

        vehicleClientService = new VehicleClientService(new ThreeWheelFactory());
        vehicleClientService.useVehicle();

        vehicleClientService = new VehicleClientService(new FourWheelFactory());
        vehicleClientService.useVehicle();
    }
}
