package org.intutech.bean;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	public Employee() {
		System.out.println("Employee Object Created");
	}
	
	public void test() {
		System.out.println("This is from Employee Class");
	}
}
