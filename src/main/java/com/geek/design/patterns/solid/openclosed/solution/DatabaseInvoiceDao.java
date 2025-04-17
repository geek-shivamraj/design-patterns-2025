package com.geek.design.patterns.solid.openclosed.solution;

import com.geek.design.patterns.solid.openclosed.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao{

    @Override
    public void save(Invoice invoice) {
        // Save to DB
    }
}
