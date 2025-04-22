package com.geek.design.patterns.creational.factory.example2.core.extension.core;

public class DefaultConcreteProduct implements Product {

    @Override
    public void doStuff() {
        System.out.println("Default Concrete Product Functionality in Core");
    }
}
