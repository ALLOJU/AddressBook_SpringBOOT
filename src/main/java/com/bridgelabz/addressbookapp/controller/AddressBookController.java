package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.model.Contact;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @GetMapping("/get")
    public ResponseEntity<String> getAddressBookData(){
        return new ResponseEntity<String>("Successfull got the data", HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<String> WelcomeuserbyID(@PathVariable("id") String id) {
        return new ResponseEntity<String>("Welcome, User " + id,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createContact(@RequestBody Contact contact) {
        return new ResponseEntity<String>("Added " + contact.getName() + " to list",HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateContact(@PathVariable("id") int id,@RequestBody Contact contact) {
        return new ResponseEntity<String>("Updated address book of id : " + id +" "+contact,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable String id) {
        return new ResponseEntity<String>("Deleted contact " + id,HttpStatus.OK);
    }
}
