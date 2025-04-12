package com.geek.design.patterns.creational.factory.example2.solution;

import com.geek.design.patterns.creational.factory.example2.Vehicle;
import com.geek.design.patterns.creational.factory.example2.solution.factory.ThreeWheelerFactory;
import com.geek.design.patterns.creational.factory.example2.solution.factory.TwoWheelerFactory;

public class MainApp {
    public static void main(String[] args) {
        Client twoWheelerClient =  new Client(new TwoWheelerFactory());
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();

        Client threeWheelerClient = new Client(new ThreeWheelerFactory());
        Vehicle threeWheeler = threeWheelerClient.getVehicle();
        threeWheeler.printVehicle();
    }
}
