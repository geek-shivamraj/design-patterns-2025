package com.geek.design.patterns.creational.abstractfactory.example1.carfactory;

import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.abstractfactory.CarFactory;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.factories.EuropeCarFactory;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.factories.NorthAmericaCarFactory;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.Car;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.CarSpecification;

public class CarFactoryClientMain {
    public static void main(String[] args) {

        // Creating cars for North America
        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        System.out.println();

        // Creating cars for Europe
        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}
