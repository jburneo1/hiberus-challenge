package com.hiberu.service.impl;

import com.hiberu.model.Invoice;
import com.hiberu.repository.IInvoiceRepository;
import com.hiberu.service.IInvoceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class InvoiceServiceImpl  implements IInvoceService {

    @Autowired
    private IInvoiceRepository repo;


    @Override
    public Invoice register(Invoice obj) {
        obj.getDetails().forEach(details -> {
            details.setInvoice(obj);
        });
        return repo.save(obj);
    }

    @Override
    public Invoice update(Invoice obj) {
        return repo.save(obj);
    }

    @Override
    public List<Invoice> list() {
        return repo.findAll();
    }

    @Override
    public Invoice getTotalOrderPrice(Invoice invoice) {
        invoice.getTotalOrderPrice();
        return invoice;
    }

    @Override
    public Invoice listById(Integer id) {
        Optional<Invoice> op = repo.findById(id);
        return op.isPresent() ? op.get() : new Invoice();
    }

}
