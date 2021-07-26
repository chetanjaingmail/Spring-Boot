package org.intutech.controller;

import java.util.List;

import org.intutech.bean.Employee;
import org.intutech.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeContorller {

	@Autowired
	private EmployeeRepo repo;
	
	// localhost:8080/employee/save
	@PostMapping("/save")
	public Employee saveEmp(@RequestBody Employee emp){
		return repo.save(emp);
	}
	
	// localhost:8080/employee/get-all
	@GetMapping("/get-all")
	public List<Employee> getAllEmp(){
		return repo.findAll();
	}
	
}
