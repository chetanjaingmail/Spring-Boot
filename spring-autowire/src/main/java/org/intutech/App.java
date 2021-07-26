package org.intutech;

import org.intutech.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-autowire.xml");
    	
    	Employee e = context.getBean("emp", Employee.class);
    	
    	System.out.println(" Id : "+ e.getId());
    	System.out.println(" Name : "+ e.getName());
    	System.out.println(" City : "+ e.getAdd().getCity());
    	System.out.println(" Pincode : "+ e.getAdd().getPincode());
    	
    }
}

