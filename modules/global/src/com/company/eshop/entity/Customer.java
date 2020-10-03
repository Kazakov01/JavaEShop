package com.company.eshop.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "ESHOP_CUSTOMER")
@Entity(name = "eshop_Customer")
@NamePattern("%s %s %s|name,firstName,secondName")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -3369740793595240339L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "SECOND_NAME")
    private String secondName;

    @NotNull
    @Column(name = "TELEPHONE", nullable = false, length = 100)
    private String telephone;

    @NotNull
    @Column(name = "EMAIL", nullable = false)
    @Email(message = "email invalid")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}