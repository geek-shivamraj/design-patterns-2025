package com.geek.design.patterns.creational.builder.example2.components;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Just another feature of a car.
 */
@Getter
@AllArgsConstructor
public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }
}
