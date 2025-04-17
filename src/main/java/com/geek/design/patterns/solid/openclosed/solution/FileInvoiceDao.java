package com.geek.design.patterns.solid.openclosed.solution;

import com.geek.design.patterns.solid.openclosed.Invoice;

public class FileInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        // Save to File
    }
}
