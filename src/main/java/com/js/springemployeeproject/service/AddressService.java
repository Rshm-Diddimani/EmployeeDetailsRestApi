package com.js.springemployeeproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.springemployeeproject.dao.AddressCRUD;
import com.js.springemployeeproject.dao.EmployeeCRUD;
import com.js.springemployeeproject.dto.Address;
import com.js.springemployeeproject.dto.Employee;

@Service
public class AddressService {

	@Autowired
	AddressCRUD crud;
	
	@Autowired
	EmployeeCRUD employeeCRUD;
	
	public Address insertAddress(int id, Address address) {
		Employee employee = employeeCRUD.getEmployeeById(id);
		address.setEmployee(employee);
		return crud.insertAddress(address);
	}
}
