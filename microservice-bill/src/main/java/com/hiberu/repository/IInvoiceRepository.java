package com.hiberu.repository;

import com.hiberu.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface IInvoiceRepository extends JpaRepository<Invoice, Integer> {

}
