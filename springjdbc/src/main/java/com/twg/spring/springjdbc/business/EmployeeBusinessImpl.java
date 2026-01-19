package com.twg.spring.springjdbc.business;

import java.util.List;


import com.twg.spring.springjdbc.dao.EmployeeDao;
import com.twg.spring.springjdbc.dto.Employee;

public class EmployeeBusinessImpl implements EmployeeBusiness {
	
	private EmployeeDao employeeDao;
	@Override
	public void printEmployeeHikes() {
		//ask dao(data access object) for employee data
		//check each employee and print hike
		List<Employee> employees=employeeDao.findAllEmployees();	
		
		if(employees!=null) {
			for(Employee employee: employees) {
				if(employee.getExp()>=15) {
					System.out.println("Employee with id"+employee.getId()+"and name"+employee.getName()+"with experience"+employee.getExp()+"got 30% hike");
				}
				else if(employee.getExp()>=10) {
					System.out.println("Employee with id"+employee.getId()+"and name"+employee.getName()+"with experience"+employee.getExp()+"got 30% hike");

				}
				else if(employee.getExp()>=5) {
					System.out.println("Employee with id"+employee.getId()+"and name"+employee.getName()+"with experience"+employee.getExp()+"got 30% hike");

				}
				else {
					System.out.println("Employee with id"+employee.getId()+"and name"+employee.getName()+"with experience"+employee.getExp()+"got 0% hike");

				}
			}
		}
		}
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
