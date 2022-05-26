package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="addressbook_table")
public @Data class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Contact_Id")
    private int contactId;
    @Column(name = "First_Name")
    private String firstName;
    @Column(name = "Last_Name")
    private String lastName;
    @Column(name = "address")
    private String address;
    @Column(name = "state")
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "zip")
    private String zip;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;


    public Contact(int contactId, ContactDTO contactDTO) {
        super();
        this.contactId = contactId;
        this.firstName = contactDTO.firstName;
        this.lastName = contactDTO.lastName;
        this.address = contactDTO.address;
        this.state = contactDTO.state;
        this.city = contactDTO.city;
        this.zip = contactDTO.zip;
        this.phone = contactDTO.phone;
        this.email=contactDTO.email;

    }

    public Contact() {

    }

    @Override
    public String toString() {
        return "Contact [contactId=" + contactId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
                + address + ", state=" + state + ", city=" + city + ", zip=" + zip + ", phone=" + phone + "]";
    }

    public void updateContact(ContactDTO contactDTO) {
        this.firstName = contactDTO.firstName;
        this.lastName = contactDTO.lastName;
        this.address = contactDTO.address;
        this.city = contactDTO.city;
        this.state = contactDTO.state;
        this.zip = contactDTO.zip;
        this.phone = contactDTO.phone;
        this.email=contactDTO.email;
    }
}
