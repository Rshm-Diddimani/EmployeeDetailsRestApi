package com.js.springemployeeproject.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.js.springemployeeproject.dao.EmployeeCRUD;
import com.js.springemployeeproject.dto.Employee;
import com.js.springemployeeproject.dto.ResponseStructure;

@Service
public class EmployeeService {

//	 Service layer works like interface/intermediator between dao and controller. 

	@Autowired
	EmployeeCRUD crud;
	
//	public Employee insertEmployee(Employee e) {
//		e.setDoj(LocalDate.now());
//		return crud.insertEmployee(e);
//	}
	
	public ResponseStructure<Employee> insertEmployee(Employee e) {
		ResponseStructure<Employee> responseStructure = new ResponseStructure<Employee>();
		e.setDoj(LocalDate.now());
		Employee employee = crud.insertEmployee(e);
		if ( employee != null) {
			responseStructure.setData( employee);
			responseStructure.setMessage("Inserted Successfully");
			responseStructure.setStatusCode(HttpStatus.ACCEPTED.value());
		} else {
			responseStructure.setData(null);
			responseStructure.setMessage("Faild To insert");
			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		}
		return responseStructure;
	}
	
	public List<Employee> getEmployees(){
		return crud.getEmployees();
	}
	
	public ResponseStructure<Employee> getEmployeeById(int id) {
		ResponseStructure<Employee> responseStructure = new ResponseStructure<Employee>();
		Employee employee = crud.getEmployeeById(id);
		if ( employee != null) {
			responseStructure.setData(employee);
			responseStructure.setMessage("Found");
			responseStructure.setStatusCode(HttpStatus.FOUND.value());
		} else {
			responseStructure.setData(null);
			responseStructure.setMessage("Not Found");
			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		}
		return responseStructure;
	}
	
//	public ResponseStructure<Employee> deleteEmployeeById(int id) {
//		ResponseStructure<Employee> responseStructure = new ResponseStructure<Employee>();
//		Employee employee = crud.deleteEmployeeById(id);
//		if ( employee != null) {
//			responseStructure.setData(employee);
//			responseStructure.setMessage("Deleted");
//			responseStructure.setStatusCode(HttpStatus.GONE.value());
//		} else {
//			responseStructure.setData(null);
//			responseStructure.setMessage("Not Deleted");
//			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
//		}
//		return responseStructure;
//	}
	
	
//	public String deleteEmployeeById(int id) {
//		if (crud.deleteEmployeeById(id)) {
//			return "DELETED";
//		} else {
//			return "EMPLOYEE NOT FOUND";
//		}
//	}
	
	public Employee updateEmployeeById(Employee employee) {
		return crud.updateEmployeeById(employee);
		
	}
	
//	public ResponseStructure<Employee> getEmployeeByName(String name){
//		ResponseStructure<Employee> responseStructure = new ResponseStructure<Employee>();
//		Employee employee = crud.getEmployeeByName(name);
//		if ( employee != null) {
//			responseStructure.setData(employee);
//			responseStructure.setMessage("FOUND");
//			responseStructure.setStatusCode(HttpStatus.FOUND.value());
//		} else {
//			responseStructure.setData(null);
//			responseStructure.setMessage("NOT FOUNT");
//			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
//		}
//		return responseStructure;
//		
//	}
	
	
}

