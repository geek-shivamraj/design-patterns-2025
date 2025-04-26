package com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.europe;

import com.geek.design.patterns.creational.abstractfactory.example1.carfactory.product.CarSpecification;

public class EuropeSpecification implements CarSpecification {

    @Override
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}
