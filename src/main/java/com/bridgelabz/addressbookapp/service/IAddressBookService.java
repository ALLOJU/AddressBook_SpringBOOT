package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.model.Contact;

import java.util.List;

public interface IAddressBookService {
    List<Contact> getContact();

    void deleteContact(int contactId);

    Contact updateContact(int contactId, ContactDTO contactDTO);

    Contact createContact(ContactDTO contactDTO);

    Contact getContactById(int contactId);

    List<Contact> getContactByCity(String city);

    List<Contact> sortByCity();

    List<Contact> sortByState();
}
