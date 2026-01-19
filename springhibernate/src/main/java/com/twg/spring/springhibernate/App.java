package com.twg.spring.springhibernate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.twg.spring.springhibernate.business.EmployeeBusiness;
import com.twg.spring.springhibernate.entities.Employee;

import java.util.List;

import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/twg/spring/springhibernate/config.xml");
    	EmployeeBusiness employeeBusiness=(EmployeeBusiness)context.getBean("employeeBusinessImpl");
//    	Employee employee=new Employee();
//    	employee.setEname("Ramya");
//    	employee.setAddress("JakkulaNekkalam");
//    	employee.setContact("7416327205");
//    	employee.setExp(5);
//    	employee.setId(1);
//    	employeeBusiness.save(employee);
//    	Employee employee=employeeBusiness.findById(1);
//    	employee.setEname("SriTeja");
//    	employee.setContact("95503849712");
//    	employeeBusiness.update(employee);
//    	employeeBusiness.delete(employee);
    	List<Employee> employee=employeeBusiness.loadAll();
    	for(Employee e: employee) {
    		System.out.println("id"+e.getId());
    		System.out.println("ename"+e.getEname());
    		System.out.println("ext"+e.getExp());
    		
    	}
    }
}
