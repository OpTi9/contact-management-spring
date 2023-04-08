package com.contact.contactmanagement.dto;

import com.contact.contactmanagement.domain.Contact;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ContactsResponse")
public class ContactsResponse {

    @XmlElementWrapper(name = "contacts")
    @XmlElement(name = "contact")
    private List<Contact> contacts;
    @XmlElement(name = "message")
    private String message;

    public ContactsResponse() {
    }

    public ContactsResponse(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public ContactsResponse(List<Contact> contacts, String message) {
        this.contacts = contacts;
        this.message = message;
    }
}
