package com.hiberu.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@ApiModel(description = "Client Information")
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Integer idClient;

    @ApiModelProperty(notes = "Name must have minimum 3 characters")
    @Column(name = "full_name", nullable = false, length = 70)
    private String fullName;

    @ApiModelProperty(notes = "Address must have minimum 3 characters")
    @Column(name = "address", nullable = false, length = 70)
    private String address;

    @ApiModelProperty(notes = "Email must have minimum 3 characters")
    @Column(name = "email", nullable = false, length = 70)
    private String email;

    @ApiModelProperty(notes = "Phone must have minimum 3 characters")
    @Column(name = "phone", nullable = false, length = 12)
    private String phone;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
