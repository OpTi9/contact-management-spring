package com.contact.contactmanagement.repository;

import com.contact.contactmanagement.domain.EmailAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailAddressRepository extends JpaRepository<EmailAddress, Long> {
}
