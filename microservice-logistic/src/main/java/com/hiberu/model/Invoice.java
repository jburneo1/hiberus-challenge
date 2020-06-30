package com.hiberu.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_invoice")
    private Integer idInvoice;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false, foreignKey = @ForeignKey(name = "fk_client_id"))
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_payment", nullable = false, foreignKey = @ForeignKey(name = "fk_payment_mode"))
    private PaymentMode paymentMode;

    private LocalDateTime localDateTime;

    @OneToMany(mappedBy = "invoice", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<Details> details;

    @Transient
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
