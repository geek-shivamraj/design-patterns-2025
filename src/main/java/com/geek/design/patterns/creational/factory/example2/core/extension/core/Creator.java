package com.geek.design.patterns.creational.factory.example2.core.extension.core;

import com.geek.design.patterns.creational.factory.example2.core.extension.ProductType;
import com.geek.design.patterns.creational.factory.example2.core.extension.factory.ProductFactory;

/*
     - Despite its name as Creator, Product creation is not the primary responsibility.
     - Usually Creator class already has some core business logic related to product classes.
     - We can use "ProductFactory" to outsource object creation.
 */


public class Creator {

    private final Product product;

    public Creator(ProductType productType) {
        product = new ProductFactory().createProduct(productType);
    }

    public void someOperations() {
        System.out.println("***** Core Service Functionality Start ****");
        product.doStuff();
        System.out.println("***** Core Service Functionality End ****");
    }

}
