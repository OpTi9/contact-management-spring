package com.contact.contactmanagement.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "contacts")
    private Set<Address> addresses = new HashSet<>();

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private Set<EmailAddress> emailAddresses = new HashSet<>();

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(Set<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }
}
