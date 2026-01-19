package com.twg.springg.springgjdbc.business;

import java.util.List;

import org.springframework.stereotype.Component;

import com.twg.springg.springgjdbc.dao.EmployeeDao;
import com.twg.springg.springgjdbc.dto.Employee;
@Component("businessEmployee")
public class BusinessEmployeeImpl implements BusinessEmployee {
	
	private EmployeeDao employeeDao;
	@Override
	public void printEmployeeHikes() {
		List<Employee> employees=employeeDao.findAllEmployeeDetails();
		if(employees!=null) {
		for(Employee employee:employees) {
			if(employee.getExp()>=15) {
				System.out.println("here"+employee.getId()+"of name"+employee.getName()+"with exp"+employee.getExp()+"30% hike");
			}
			else if(employee.getExp()>=10) {
				System.out.println("here"+employee.getId()+"of name"+employee.getName()+"with exp"+employee.getExp()+"20% hike");

			}
			else if(employee.getExp()>=5) {
				System.out.println("here"+employee.getId()+"of name"+employee.getName()+"with exp"+employee.getExp()+"10% hike");

			}
			else {
				System.out.println("here"+employee.getId()+"of name"+employee.getName()+"with exp"+employee.getExp()+"0% hike");

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
	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.insert(employee);
		
	}
	@Override
	public Employee getEmployeeById(String id) {
		Employee employee=null;
		try {
		 employee=employeeDao.getEmployeeById(id);
		}
		catch(Exception e) {
			
		}
		if(employee!=null) {
		return employee;
	}
		else {
			System.out.println("not found by id"+id);
		}
		return employee;
}
	
}
