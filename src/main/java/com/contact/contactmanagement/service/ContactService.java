package com.contact.contactmanagement.service;

import com.contact.contactmanagement.domain.Contact;
import com.contact.contactmanagement.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    // List all contacts
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    // Find a contact by ID
    public Optional<Contact> findById(Long id) {
        return contactRepository.findById(id);
    }

    // Save or update a contact
    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }

    // Delete a contact by ID
    public void deleteById(Long id) {
        contactRepository.deleteById(id);
    }

    // Check if a contact exists by ID
    public boolean existsById(Long id) {
        return contactRepository.existsById(id);
    }
}
