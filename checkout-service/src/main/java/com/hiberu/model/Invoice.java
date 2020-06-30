package com.hiberu.model;

import java.time.LocalDateTime;
import java.util.List;


public class Invoice {

    private Integer idInvoice;

    private Client client;

    private PaymentMode paymentMode;

    private LocalDateTime localDateTime;

    private List<Details> details;

    public Double getTotalOrderPrice() {
        double sum = 0;
        List<Details> details = getDetails();
        for (Details d : details) {
            sum += d.getSubtotalPrice();
        }
        return sum;
    }

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public List<Details> getDetails() {
        return details;
    }

    public void setDetails(List<Details> details) {
        this.details = details;
    }
}
