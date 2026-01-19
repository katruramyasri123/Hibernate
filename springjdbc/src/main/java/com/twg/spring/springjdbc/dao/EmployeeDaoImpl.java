package com.twg.spring.springjdbc.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.twg.spring.springjdbc.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void insertEmployee(Employee employee) {
		//code to insert employee object into database
	}

	@Override
	public List<Employee> findAllEmployees() {
		//code to return employees in employee table;
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/springjdbc";
		String username="root";
		String password="ramya";
		List<Employee> employees=new ArrayList<>();
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username, password);
			Statement stmt=con.createStatement();
			ResultSet re=stmt.executeQuery("select * from employee");
			while(re.next()) {
				
				String id=re.getString(1);
				String  name=re.getString(2);
				int exp=re.getInt(3);
				Employee employee=new Employee(id,name,exp);
				employees.add(employee);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return employees;
	}

	@Override
	public Employee getEmployeeById(String id) {
		//code to get the employee by id
		return null;
	}

}
