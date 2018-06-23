package com.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
