package com.contact.contactmanagement.controller;

import com.contact.contactmanagement.domain.Contact;
import com.contact.contactmanagement.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    // Display the list of contacts
    @GetMapping
    public String listContacts(Model model) {
        model.addAttribute("contacts", contactService.findAll());
        return "contacts/list";
    }

    // Show the form to add a new contact
    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contacts/add";
    }

    // Save the new contact
    @PostMapping
    public String saveContact(@ModelAttribute Contact contact) {
        contactService.save(contact);
        return "redirect:/contacts";
    }

    // Show the form to edit a contact
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        contactService.findById(id).ifPresent(contact -> model.addAttribute("contact", contact));
        return "contacts/edit";
    }

    // Update the contact
    @PostMapping("/{id}/edit")
    public String updateContact(@PathVariable("id") Long id, @ModelAttribute Contact contact) {
        contact.setId(id);
        contactService.save(contact);
        return "redirect:/contacts";
    }

    // Delete a contact
    @GetMapping("/{id}/delete")
    public String deleteContact(@PathVariable("id") Long id) {
        contactService.deleteById(id);
        return "redirect:/contacts";
    }
    // Show the login page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
}
