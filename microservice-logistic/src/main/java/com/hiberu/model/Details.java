package com.hiberu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@ApiModel(description = "Details Information")
@Entity
@Table(name = "details")
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetail;

    @ApiModelProperty()
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_invoice", nullable = false, foreignKey = @ForeignKey(name = "fk_details_invoice"))
    private Invoice invoice;

    @ApiModelProperty(notes = "Products names")
    @Column(name = "nameProduct")
    private String nameProduct;

    @Column(name = "idProduct")
    private Integer idProduct;

    @ApiModelProperty(notes = "Price for products")
    @Column(name = "price")
    private Integer price;

    @ApiModelProperty(notes = "Quantity for products")
    @Column(name = "quantity")
    private Double quantity;

    @Transient
    private Double subtotalPrice;

    public Integer getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(Integer idDetail) {
        this.idDetail = idDetail;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getSubtotalPrice() {
        return getPrice() * getQuantity();
    }

    public void setSubtotalPrice(Double subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

}
