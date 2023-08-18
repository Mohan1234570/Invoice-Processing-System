package com.krish.service;

import java.util.List;

import com.krish.model.Invoice;

public interface InvoiceService {

	public Invoice addInvoice(Invoice invoice);

    public List<Invoice> getInvoices();
    
    public Invoice deleteInvoice(long id);
}
