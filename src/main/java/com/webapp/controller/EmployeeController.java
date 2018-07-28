package com.webapp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.dto.EmployeeDto;
import com.webapp.service.EmployeeService;
import com.webapp.services.impl.EmployeeServiceImpl;
import com.webapp.util.Constants;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = Constants.SAVE_EMP, method= RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void addEmployee(@RequestBody EmployeeDto employeeDto) {
		System.out.println("i m here");
		employeeService.save(employeeDto);
	}

	@RequestMapping(Constants.GET_ALL_EMPS)
	public List<EmployeeDto> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
}
