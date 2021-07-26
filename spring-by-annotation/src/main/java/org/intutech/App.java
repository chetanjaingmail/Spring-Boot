package org.intutech;

import java.util.List;

import org.intutech.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("org.intutech");
        Employee e = ctx.getBean("emp", Employee.class);
        System.out.println(" Id : "+ e.getId());
        System.out.println(" Name : "+ e.getName());
    }
    
    @Bean(value = "emp")
    public Employee getEmpObject() {
    	Employee emp = new Employee();
    	emp.setId(22);
    	emp.setName("Abc");
    	String[] contact = {"567567567","978978977"};
    	emp.setContact(contact);
    	return emp;
    }
    
}

/*
org.intutech
	App.java
org.intutech.bean
	Employee.java
	Address.java
org.intutech.service
	EmployeeService.java
org.intutech.controller
	EmployeeController.java
org.intutech.util
*/