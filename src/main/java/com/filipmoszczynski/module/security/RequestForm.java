package com.filipmoszczynski.module.security;

import com.filipmoszczynski.module.security.custom.CompanyConstraint;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class RequestForm {

    @NotBlank(message = "Name is required")
    private  String name;

    @NotNull(message = "Surname is required")
    private String surname;

    @NotEmpty(message = "Email is required")
    @Email(message = "Email is not valid")
    private String email;

    @CompanyConstraint
    private String company;

    public String getCompany() {
        return company;
    }

    public RequestForm setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getName() {
        return name;
    }

    public RequestForm setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public RequestForm setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RequestForm setEmail(String email) {
        this.email = email;
        return this;
    }
}
