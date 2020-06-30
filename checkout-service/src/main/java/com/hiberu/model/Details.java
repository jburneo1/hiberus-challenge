package com.hiberu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "Details Information")

public class Details {

    private Integer idDetail;

    @ApiModelProperty()
    @JsonIgnore
    private Invoice invoice;

    @ApiModelProperty(notes = "Products names")
    private String nameProduct;

    private Integer idProduct;

    @ApiModelProperty(notes = "Price for products")
    private Integer price;

    @ApiModelProperty(notes = "Quantity for products")
    private Double quantity;

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
