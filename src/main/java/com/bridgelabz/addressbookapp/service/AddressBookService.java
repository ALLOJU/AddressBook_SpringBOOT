package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.Contact;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AddressBookService implements IAddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;
    // List<Contact> contactList = new ArrayList<>();
    @Override
    public List<Contact> getContact() {

        return addressBookRepository.findAll();
    }

    @Override
    public Contact getContactById(int contactId) {

        return addressBookRepository.findById(contactId)
                .orElseThrow(() -> new AddressBookException("Addressbook with ContactId" + contactId
                        + " Doesn't Exists...!"));

    }

    @Override
    public List<Contact> getContactByCity(String city) {
        return addressBookRepository.findContactListByCity(city);
    }

    @Override
    public List<Contact> sortByCity() {
        return addressBookRepository.sortByCity();
    }

    @Override
    public List<Contact> sortByState() {
        return addressBookRepository.sortByState();
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) {

            Contact contactData = new Contact(contactDTO);
            //contactList.add(contactData);
            return addressBookRepository.save(contactData);

    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) {
        Contact contactData = this.getContactById(contactId);
        contactData.updateContact(contactDTO);
        return addressBookRepository.save(contactData);
    }

    @Override
    public void deleteContact(int contactId) {
        Contact contactData = this.getContactById(contactId);
        addressBookRepository.delete(contactData);

    }
}
