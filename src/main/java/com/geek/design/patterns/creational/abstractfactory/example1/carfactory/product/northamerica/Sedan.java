package com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.northamerica;

import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.Car;

public class Sedan implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling Sedan Car.");
    }
}
