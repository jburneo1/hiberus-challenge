package com.hiberu.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "Payments Information")
public class PaymentMode {

    private Integer idPayment;

    @ApiModelProperty(notes = "Name must have minimum 3 characters")
    private String name;

    public Integer getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Integer idPayment) {
        this.idPayment = idPayment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
