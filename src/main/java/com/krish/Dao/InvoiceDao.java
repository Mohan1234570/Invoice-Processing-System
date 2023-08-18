package com.krish.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krish.model.Invoice;

public interface InvoiceDao extends JpaRepository<Invoice, Long>{

}
