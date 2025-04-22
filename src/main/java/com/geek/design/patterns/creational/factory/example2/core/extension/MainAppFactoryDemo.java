package com.geek.design.patterns.creational.factory.example2.core.extension;

import com.geek.design.patterns.creational.factory.example2.core.extension.core.Creator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainAppFactoryDemo {

    public static void main(String[] args) {
        Creator creator = new Creator(ProductType.DEFAULT_PRODUCT);
        creator.someOperations();
        System.out.println();

        creator = new Creator(ProductType.EXTENDED_PRODUCT);
        creator.someOperations();
    }
}
