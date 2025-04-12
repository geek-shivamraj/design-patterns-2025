package com.geek.design.patterns.creational.factory.example2.solution;

import com.geek.design.patterns.creational.factory.example2.Vehicle;
import com.geek.design.patterns.creational.factory.example2.solution.factory.VehicleFactory;

/*
    1. Vehicle serves as the Product interface, defining the common method printVehicle() that all concrete products must implement.

    2. TwoWheeler, ThreeWheeler, FourWheeler are concrete product classes representing different types of vehicles, implementing the printVehicle() method.

    3. VehicleFactory acts as the Creator interface (Factory Interface) with a method createVehicle() representing the factory method.

    4. TwoWheelerFactory and FourWheelerFactory are concrete creator classes (Concrete Factories)
        implementing the VehicleFactory interface to create instances of specific types of vehicles.
 */

public class Client {

    private final Vehicle vehicle;

    public Client(VehicleFactory factory) {
        vehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
