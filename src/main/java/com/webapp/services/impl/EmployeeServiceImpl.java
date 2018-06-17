package com.webapp.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.dto.EmployeeDto;
import com.webapp.repository.EmployeeRepository;
import com.webapp.service.EmployeeService;
import com.webapp.util.EmployeeConverter;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void save(EmployeeDto employeeDto) {
		employeeRepository.save(EmployeeConverter.dtoToEntity(employeeDto));
		
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		return employeeRepository.findAll().stream().map(EmployeeConverter::entityToDto).collect(Collectors.toList());
	}
	
	
	

}
