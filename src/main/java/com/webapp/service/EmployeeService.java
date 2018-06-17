package com.webapp.service;

import java.util.List;

import com.webapp.dto.EmployeeDto;



public interface EmployeeService {

	void save(EmployeeDto employeeDtpo);
	List<EmployeeDto> getAllEmployees();
	
}
