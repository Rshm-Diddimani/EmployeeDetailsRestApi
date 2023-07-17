package com.js.springemployeeproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.js.springemployeeproject.dto.Address;
import com.js.springemployeeproject.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService service;
	
	@PostMapping("/address/{id}")
	public Address insertAddress(@PathVariable int id, @RequestBody Address address) {
		return service.insertAddress(id, address);
	}
}
