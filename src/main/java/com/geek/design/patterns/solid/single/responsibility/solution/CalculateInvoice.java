package com.geek.design.patterns.solid.single.responsibility.solution;

import com.geek.design.patterns.solid.single.responsibility.Marker;
import lombok.AllArgsConstructor;

/*
     Now this class is following Single Responsibility principle
        - As this class has only 1 reason to change i.e, invoice calculation logic
 */

@AllArgsConstructor
public class CalculateInvoice {

    private Marker marker;
    private int quantity;

    public int calculateTotal() {
        return marker.getPrice() * quantity;
    }

}
