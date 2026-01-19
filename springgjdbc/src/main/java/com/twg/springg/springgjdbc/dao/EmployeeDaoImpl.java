package com.twg.springg.springgjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.twg.springg.springgjdbc.dao.rowmapper.EmployeeRowMapper;
import com.twg.springg.springgjdbc.dto.Employee;
@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Employee> findAllEmployeeDetails() {
		EmployeeRowMapper rowmapper=new EmployeeRowMapper();
		
		List<Employee> employees=jdbcTemplate.query("select * from employee where exp>?",rowmapper,21);
		
		return employees;
	}

	@Override
	public Employee getEmployeeById(String id) {
		EmployeeRowMapper rowmapper =new EmployeeRowMapper();
		
		Employee employee=(Employee) jdbcTemplate.queryForObject("select * from employee where  id=?", rowmapper, id);
		return employee;
	}

	@Override
	public void insert(Employee employee) {
//		String qry="insert into employee values('"+employee.getId()+"','"+employee.getName()+"',"+employee.getExp()+")";
		String qry="insert into employee values(?,?,?)";
		System.out.println(qry);
		jdbcTemplate.update(qry,employee.getId(),employee.getName(),employee.getExp());
		
	}

}
