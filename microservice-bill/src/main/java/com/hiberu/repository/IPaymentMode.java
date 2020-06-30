package com.hiberu.repository;

import com.hiberu.model.PaymentMode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentMode extends JpaRepository<PaymentMode, Integer> {
}
