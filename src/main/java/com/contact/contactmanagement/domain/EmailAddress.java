package com.contact.contactmanagement.domain;

import javax.persistence.*;

@Entity
public class EmailAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    // Getters, setters, and other methods as needed
}