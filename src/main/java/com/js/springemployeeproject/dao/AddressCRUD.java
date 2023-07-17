package com.js.springemployeeproject.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.js.springemployeeproject.dto.Address;
import com.js.springemployeeproject.repository.AddressRepository;

@Repository
public class AddressCRUD {
	
	@Autowired
	AddressRepository repository;
	
	public Address insertAddress(Address address) {
		return repository.save(address);
	}
}
