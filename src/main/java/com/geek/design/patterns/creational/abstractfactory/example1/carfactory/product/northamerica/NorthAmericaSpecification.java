package com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.northamerica;

import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.CarSpecification;

public class NorthAmericaSpecification implements CarSpecification {

    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety features complaint with local regulations.");
    }
}
