package com.twg.springg.springgjdbc.business;

import com.twg.springg.springgjdbc.dto.Employee;

public interface BusinessEmployee {
	void printEmployeeHikes();
	void insertEmployee(Employee employee);
	Employee getEmployeeById(String id);


}
