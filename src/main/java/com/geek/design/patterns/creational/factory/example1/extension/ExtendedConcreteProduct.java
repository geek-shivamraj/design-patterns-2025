package com.geek.design.patterns.creational.factory.example1.extension;

import com.geek.design.patterns.creational.factory.example1.core.Product;

/*
    - Based on Product Type i.e., EXTENDED
    - Override core specific functionality specific to the product.
 */

public class ExtendedConcreteProduct implements Product {

    @Override
    public void doStuff() {
        System.out.println("Extended Concrete Product Functionality in Extension");
    }
}
