package com.contact.contactmanagement.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private Set<Address> addresses;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private Set<EmailAddress> emailAddresses;

    // Getters, setters, and other methods as needed
}
