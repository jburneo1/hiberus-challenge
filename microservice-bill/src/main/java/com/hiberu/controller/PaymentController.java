package com.hiberu.controller;

import com.hiberu.model.Invoice;
import com.hiberu.model.PaymentMode;
import com.hiberu.repository.IPaymentMode;
import com.hiberu.service.IPamentModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private IPamentModeService iPamentModeService;

    @GetMapping("list")
    public ResponseEntity<List<PaymentMode>> list() {
        List<PaymentMode> list = iPamentModeService.list();
        return new ResponseEntity<List<PaymentMode>>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PaymentMode> create(@RequestBody PaymentMode paymentMode) {
        PaymentMode obj = iPamentModeService.register(paymentMode);
        return new ResponseEntity<PaymentMode>(obj, HttpStatus.OK);
    }
}
