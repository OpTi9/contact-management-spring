package com.contact.contactmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

    // Show the login page
    @GetMapping("/contacts/login")
    public String showLoginPage() {
        return "contacts/login";
    }
}
