package org.intutech.bean;

public class Employee {
	private int id;
	private String name;
	private Address add;
	
	public Employee(int id, String name, Address add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAdd() {
		return add;
	}
	
	/*
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	*/
}
