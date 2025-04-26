package com.geek.design.patterns.creational.abstractfactory.example1.carfactory.factories;

import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.Car;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.CarSpecification;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.northamerica.NorthAmericaSpecification;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.northamerica.Sedan;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.abstractfactory.CarFactory;

public class NorthAmericaCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}
