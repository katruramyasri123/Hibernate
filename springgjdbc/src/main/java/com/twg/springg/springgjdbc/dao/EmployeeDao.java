package com.twg.springg.springgjdbc.dao;

import java.util.List;

import com.twg.springg.springgjdbc.dto.Employee;

public interface EmployeeDao {
	List<Employee> findAllEmployeeDetails();
	Employee getEmployeeById(String id);
	void insert(Employee employee);
}
