package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public @Data class ContactDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Address book is Invalid!!! ")
    @NotEmpty(message = "first name cannot be null")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$", message = "Address book is Invalid!!! ")
    @NotEmpty(message = "last name cannot be null")
    public String lastName;
    @Pattern(regexp = "^[A-Za-z,.0-9]{3,}$", message = "Address is Invalid!!! ")
    @NotEmpty(message = "Address cannot be null")
    public String address;
    public String state;
    public String city;
    @Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$")
    public String zip;
    @Pattern(regexp = "^^[0-9]{2}?[\\s,-]{0,1}[7-9]{1}[0-9]{9}$")
    public String phone;

    public ContactDTO(String firstName, String lastName, String address, String state, String city, String zip,
                      String phone) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
    }


}
