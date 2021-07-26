package org.intutech.bean;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<Project> projects; // Student HAS-A projects
	public Student(int id, String name, List<Project> projects) {
		this.id = id;
		this.name = name;
		this.projects = projects;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<Project> getProjects() {
		return projects;
	}
	
}
