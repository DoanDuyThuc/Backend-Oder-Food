package com.thuc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuc.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
