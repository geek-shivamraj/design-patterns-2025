package com.geek.design.patterns.solid.openclosed.problem;

import com.geek.design.patterns.solid.single.responsibility.problem.Invoice;
import lombok.AllArgsConstructor;

/*
     Now this class is following Single Responsibility principle
        - As this class has only 1 reason to change i.e., saving logic to file or DB or Redis anywhere

     Question 2 - Is this class following Open/Closed Principle ?
     Answer - NO
     Reason/Problem:
        - Suppose this file is already tested & live. Now we have a new requirement: SaveToFile or SaveToRedis etc.
        - According to Open/Closed Principle: A Class that's already tested & live should be open for extension
            but closed for Modification.
        - i.e., Rather than modifying the existing class to avoid any bug, Extend the class to add new feature/functionality.
     Solution:
        - Create an interface with save(Invoice invoice) method.
        - Now implement the interface for DB, Redis, File
 */

@AllArgsConstructor
public class SaveInvoice {
    private Invoice invoice;

    public void saveToDB() {        // Already existing tested & deployed method.
        // Save into DB
    }

    public void saveToFile(String fileName) {       // New Method or feature
        // Save Invoice in the file with the given name
    }

}
