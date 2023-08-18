package com.krish.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krish.Dao.InvoiceDao;
import com.krish.model.Invoice;
import com.krish.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	InvoiceDao invoiceDao;
	
	@Override
	public Invoice addInvoice(Invoice invoice) {
	
		 invoiceDao.save(invoice);
		 
		 return invoice;
		
	}

	@Override
	public List<Invoice> getInvoices() {
		
		return invoiceDao.findAll();
	}

	@Override
	public Invoice deleteInvoice(long id) {
		
		 Invoice invoice = invoiceDao.findById(id).get();
		  invoiceDao.delete(invoice);
          return invoice;
	}

}
