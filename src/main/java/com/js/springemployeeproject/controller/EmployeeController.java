package com.js.springemployeeproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.js.springemployeeproject.dto.Employee;
import com.js.springemployeeproject.dto.ResponseStructure;
import com.js.springemployeeproject.service.EmployeeService;

@RestController
@RequestMapping(value = {"/employee", "/"})
public class EmployeeController {
	
	@Autowired
	EmployeeService service;

//	@PostMapping("/employees")
//	public Employee insertEmployee(@RequestBody Employee e) {
//		return service.insertEmployee(e);
//	}
	
	@PostMapping("/employeess")
	public ResponseStructure<Employee> insertEmployee(@RequestBody Employee e) {
		return service.insertEmployee(e);
	}

	
	@GetMapping("/allemployees")
	public List<Employee> getEmployees(){
		return service.getEmployees();
		
	}
	
	
//	@GetMapping("/employees/{id}")
//	public Employee getEmployeeById(@PathVariable int id) {
//		return service.getEmployeeById(id);
//	}
	
	@GetMapping("/employees/{id}")
	public ResponseStructure<Employee> getEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}
//	
	
//	@DeleteMapping("/employees")
//	public String deleteEmployeeById(@RequestParam int id) {
//		return service.deleteEmployeeById(id);
//	}
	
//	@DeleteMapping("/employees")
//	public ResponseStructure<Employee> deleteEmployeeById(@RequestParam int id) {
//		return service.deleteEmployeeById(id);
//	}
	
	@PutMapping("/employees")
	public Employee updateEmployeeById(Employee employee) {
		return service.updateEmployeeById(employee);
		
	}
	
//	@GetMapping("/employees/name")
//	public ResponseStructure<Employee> getEmployeeByName(@PathVariable String name) {
//		return service.getEmployeeByName(name);
//	}
	
}
