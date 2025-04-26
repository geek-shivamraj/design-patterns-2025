package com.geek.design.patterns.creational.abstractfactory.example1.carfactory.factories;

import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.Car;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.CarSpecification;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.europe.EuropeSpecification;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.europe.Hatchback;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.abstractfactory.CarFactory;

public class EuropeCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
