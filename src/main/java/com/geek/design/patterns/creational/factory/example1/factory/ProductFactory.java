package com.geek.design.patterns.creational.factory.example1.factory;

import com.geek.design.patterns.creational.factory.example1.ProductType;
import com.geek.design.patterns.creational.factory.example1.core.DefaultConcreteProduct;
import com.geek.design.patterns.creational.factory.example1.core.Product;
import com.geek.design.patterns.creational.factory.example1.extension.ExtendedConcreteProduct;

public class ProductFactory {

    public Product createProduct(ProductType productType) {
        if(ProductType.DEFAULT_PRODUCT.equals(productType)) {
            return new DefaultConcreteProduct();
        } else if (ProductType.EXTENDED_PRODUCT.equals(productType)) {
            return new ExtendedConcreteProduct();
        } else {
            throw new IllegalArgumentException("Unknown Product Type");
        }
    }
}
