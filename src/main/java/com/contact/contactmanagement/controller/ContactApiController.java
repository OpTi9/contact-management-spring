package com.contact.contactmanagement.controller;

import com.contact.contactmanagement.domain.Contact;
import com.contact.contactmanagement.dto.ContactsResponse;
import com.contact.contactmanagement.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/xml")
public class ContactApiController {

    @Autowired
    private ContactService contactService;

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public ContactsResponse handleRequest(@RequestParam("action") String action, @RequestParam(value = "id", required = false) Long id) {
        switch (action) {
            case "listContacts":
                List<Contact> contacts = contactService.findAll();
                return new ContactsResponse(contacts);
            case "getContact":
                if (id != null) {
                    Optional<Contact> optionalContact = contactService.findById(id);
                    if (optionalContact.isPresent()) {
                        return new ContactsResponse(List.of(optionalContact.get()));
                    } else {
                        return new ContactsResponse(List.of(), "Contact with id " + id + " does not exist.");
                    }
                } else {
                    return new ContactsResponse(List.of(), "No contact ID provided.");
                }
            case "delContact":
                if (id != null) {
                    // Check if the contact exists before deleting it
                    if (contactService.existsById(id)) {
                        contactService.deleteById(id);
                        return new ContactsResponse(List.of(), "Contact with id " + id + " has been deleted.");
                    } else {
                        // If the contact does not exist, return an appropriate message
                        return new ContactsResponse(List.of(), "Contact with id " + id + " does not exist.");
                    }
                }
                return new ContactsResponse(List.of());

            default:
                throw new IllegalArgumentException("Invalid action: " + action);
        }
    }
}