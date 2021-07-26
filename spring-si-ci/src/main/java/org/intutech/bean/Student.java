package org.intutech.bean;

import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private String higherEdu;
	private String[] contact;
	private Set<String> skills;
	private Map<Integer, String> address;
	
	public Student(int id, String name, String higherEdu, String[] contact, 
			Set<String> skills, Map<Integer,String> address) {
		this.id = id;
		this.name = name;
		this.higherEdu = higherEdu;
		this.contact = contact;
		this.skills = skills;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getHigherEdu() {
		return higherEdu;
	}
	
	public String[] getContact() {
		return contact;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public Map<Integer, String> getAddress() {
		return address;
	}
}
