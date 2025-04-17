package com.geek.design.patterns.solid.single.responsibility.solution;

import com.geek.design.patterns.solid.single.responsibility.problem.Invoice;
import lombok.AllArgsConstructor;

/*
     Now this class is following Single Responsibility principle
        - As this class has only 1 reason to change i.e., printing logic
 */

@AllArgsConstructor
public class PrintInvoice {
    private Invoice invoice;

    public void printInvoice() {
        // print the Invoice
    }
}
