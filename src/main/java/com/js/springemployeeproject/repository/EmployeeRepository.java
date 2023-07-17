package com.js.springemployeeproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.js.springemployeeproject.dto.Employee;


//InJPA Reposiotory accepts 2 arguments first entity class and second Primary keys primitive datatype. 
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
//	@Query("Select e from employees e where e.name = :ename")
//	public Employee findByName(@Param("ename") String name);
}
