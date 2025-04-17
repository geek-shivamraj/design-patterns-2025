package com.geek.design.patterns.solid.single.responsibility.problem;

import com.geek.design.patterns.solid.single.responsibility.Marker;
import lombok.AllArgsConstructor;

/*
    Is this class following Single Responsibility Principle i.e., does the class have only 1 reason to change ?
    Ans - NO

    Reason to change
    1. Suppose we want to change the calculation logic & add GST or discount then definitely calculation logic will change.
        - so Invoice class is getting changed becoz of calculation logic change.
    2. Change in printing logic
    3. Change in saving invoice logic (in DB, File, Caching)

    Total - 3 Reasons to change this class

    Solutions - We can split Invoice class to CalculateInvoice, PrintInvoice, SaveInvoice
 */


@AllArgsConstructor
public class Invoice {

    private Marker marker; // HAS-A Relationship i.e., Invoice has Marker
    private int quantity;

    public int calculateTotal() {
        return marker.getPrice() * quantity;
    }

    public void printInvoice() {
        // print the Invoice
    }

    public void saveToDB() {
        // Save the data to DB
    }

}
