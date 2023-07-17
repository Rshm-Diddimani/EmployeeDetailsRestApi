package com.js.springemployeeproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.js.springemployeeproject.dto.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
