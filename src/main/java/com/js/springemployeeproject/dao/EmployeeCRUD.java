package com.js.springemployeeproject.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.js.springemployeeproject.dto.Employee;
import com.js.springemployeeproject.repository.EmployeeRepository;

//Repository creates a components
@Repository
public class EmployeeCRUD {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
//	Container knows how to create object of the interface 
	
//	Whenever we are working with containers never write static methods
	public Employee insertEmployee(Employee e) {
		employeeRepository.save(e); // calling save method it will insert data into the database
		return e;
	}
	
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}
	
	public Employee getEmployeeById(@PathVariable int id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
		
//		if (optional != null) {
//			return optional.get();
//		} else {
//			return null;
//		}
	}
	
//	public Employee deleteEmployeeById(@PathVariable int id) {
//		Optional<Employee> optional = employeeRepository.findById(id);
//		Employee employee = optional.get();
//		if (employee != null) {
//			employeeRepository.delete(employee);
//			return employee;
//		} else {
//			return null;
//		}
//	}
//	public boolean deleteEmployeeById(int id) {
//		Optional<Employee> optional = employeeRepository.findById(id);
//		Employee employee = optional.get();
//		if (employee != null) {
//			employeeRepository.delete(employee);
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public Employee updateEmployeeById(Employee employee) {
		return employeeRepository.save(employee);
	}
	
//	public Employee getEmployeeByName(String name) {
//		return employeeRepository.findByName(name);
//		
//	}
}
