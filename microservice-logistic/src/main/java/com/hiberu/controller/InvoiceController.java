package com.hiberu.controller;

import com.hiberu.exception.ModelNotFoundException;
import com.hiberu.model.Invoice;
import com.hiberu.service.IInvoceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/logistic")
public class InvoiceController {

    @Autowired
    private IInvoceService invoceService;

    @GetMapping("/{id}")
    public ResponseEntity<Invoice> listById(@PathVariable("id") Integer id) {
        Invoice obj = invoceService.listById(id);
        if (obj.getIdInvoice() == null) {
            throw new ModelNotFoundException("Id not found" + id);
        }
        return new ResponseEntity<Invoice>(obj, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Invoice> create(@RequestBody Invoice invoice) {
        Invoice obj = invoceService.register(invoice);
        Invoice obj1 = invoceService.getTotalOrderPrice(invoice);
        return new ResponseEntity<Invoice>(obj, HttpStatus.OK);
    }
}
