package org.intutech.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Employee {
	
	private Address add;
	private int id;
	private String name;
	private String[] contact;
	
	public String[] getContact() {
		return contact;
	}
	public void setContact(String[] contact) {
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Autowired
	public void setAdd(Address add) {
		System.out.println("Address Class Objected Injected inside Employee...");
		this.add = add;
	}
	
	public Employee() {
		System.out.println("Employee Object Created...");
	}
}
