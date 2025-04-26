package com.geek.design.patterns.creational.abstractfactory.example1.carfactory.abstractfactory;

import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.Car;
import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.CarSpecification;

public interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}
