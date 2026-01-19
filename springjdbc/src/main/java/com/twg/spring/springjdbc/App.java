package com.twg.spring.springjdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.twg.spring.springjdbc.business.EmployeeBusiness;

import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/twg/spring/springjdbc/configMetaData.xml");
        EmployeeBusiness employeeBusiness=(EmployeeBusiness)context.getBean("employeeBusiness");
        employeeBusiness.printEmployeeHikes();
        
    }
}
