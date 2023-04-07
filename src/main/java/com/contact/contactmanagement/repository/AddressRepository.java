package com.contact.contactmanagement.repository;

import com.contact.contactmanagement.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
