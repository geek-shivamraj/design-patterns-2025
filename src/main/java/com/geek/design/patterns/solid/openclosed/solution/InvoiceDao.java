package com.geek.design.patterns.solid.openclosed.solution;

import com.geek.design.patterns.solid.openclosed.Invoice;

/*
    Solution:
        - New features/functionality like Save to DB, File, Redis etc can be easily extended
            via implementing this interface.
        - Now Save to DB class has no impact from any change in save to File

 */

public interface InvoiceDao {
    public void save(Invoice invoice);
}
