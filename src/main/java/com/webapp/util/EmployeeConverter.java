package com.webapp.util;

import com.webapp.dto.EmployeeDto;
import com.webapp.entity.Employee;

public class EmployeeConverter {
	
	public static Employee dtoToEntity(EmployeeDto employeeDto) {
		Employee employee = new Employee(employeeDto.getEmployeeName());
		employee.setId(employeeDto.getEmployeeId());
		return employee;
	}
	
	public static EmployeeDto entityToDto(Employee employee) {
		EmployeeDto employeeDto = new EmployeeDto(employee.getId(),employee.getName());
		return employeeDto;
	}

}
