package com.geek.design.patterns.creational.factory.example2.problem;

import com.geek.design.patterns.creational.factory.example2.Vehicle;

public class MainApp {
    public static void main(String[] args) {
        Client client = new Client(1);
        Vehicle vehicle = client.getVehicle();
        vehicle.printVehicle();

        client = new Client(2);
        vehicle = client.getVehicle();
        vehicle.printVehicle();
    }
}
