package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.dto.EmployeeDto;
import com.webapp.repository.EmployeeRepository;
import com.webapp.services.impl.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeService;
	
	@PostMapping("/employees")
	@ResponseStatus(HttpStatus.CREATED)
	public void addEmployee(@RequestBody EmployeeDto employeeDto) {
		employeeService.save(employeeDto);
	}
	
	@GetMapping("/employees")
	public List<EmployeeDto> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	
}
