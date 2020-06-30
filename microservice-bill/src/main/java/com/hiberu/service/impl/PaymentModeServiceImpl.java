package com.hiberu.service.impl;

import com.hiberu.repository.IPaymentMode;
import com.hiberu.service.IPamentModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentModeServiceImpl implements IPamentModeService {

    @Autowired
    private IPaymentMode repo;

    @Override
    public PaymentMode register(PaymentMode obj) {
        return repo.save(obj);
    }

    @Override
    public PaymentMode update(PaymentMode obj) {
        return repo.save(obj);
    }

    @Override
    public List<PaymentMode> list() {
        return repo.findAll();
    }
}
