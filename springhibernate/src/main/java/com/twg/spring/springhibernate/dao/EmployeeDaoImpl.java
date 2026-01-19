package com.twg.spring.springhibernate.dao;


import com.twg.spring.springhibernate.entities.Employee;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private HibernateTemplate  hibernateTemplate;

	@Transactional(readOnly=false)
	public void save(Employee employee) {
		hibernateTemplate.save(employee);
	}

	@Override
	@Transactional(readOnly=false)
	public void update(Employee employee) {
		hibernateTemplate.update(employee);
		
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(Employee employee) {
		hibernateTemplate.delete(employee);
		
	}

	@Override
	public Employee findById(int id) {
		Employee emp=hibernateTemplate.get(Employee.class, id);
		return emp;
	}

	@Override
	public List<Employee> loadAll() {
		
		return hibernateTemplate.loadAll(Employee.class);
	}

}
