package com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.europe;

import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.Car;

public class Hatchback implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback Car.");
    }
}
