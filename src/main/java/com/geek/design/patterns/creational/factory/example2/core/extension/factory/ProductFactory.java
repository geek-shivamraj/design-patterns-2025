package com.geek.design.patterns.creational.factory.example2.core.extension.factory;

import com.geek.design.patterns.creational.factory.example2.core.extension.ProductType;
import com.geek.design.patterns.creational.factory.example2.core.extension.core.DefaultConcreteProduct;
import com.geek.design.patterns.creational.factory.example2.core.extension.core.Product;
import com.geek.design.patterns.creational.factory.example2.core.extension.extension.ExtendedConcreteProduct;

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
