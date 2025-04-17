package com.geek.design.patterns.solid.single.responsibility.solution;

import com.geek.design.patterns.solid.single.responsibility.problem.Invoice;
import lombok.AllArgsConstructor;

/*
     Now this class is following Single Responsibility principle
        - As this class has only 1 reason to change i.e., saving logic to file or DB or Redis anywhere
 */

@AllArgsConstructor
public class SaveInvoice {
    private Invoice invoice;

    public void saveToDB() {
        // Save into DB
    }

}
