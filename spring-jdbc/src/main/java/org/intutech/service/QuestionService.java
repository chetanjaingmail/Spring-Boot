package org.intutech.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class QuestionService {

	private JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void save() {
		String query = "insert into question values(0,'What is java?','I wants to know about java','2021-06-16')";
		int count = template.update(query);
		System.out.println(count + " : rows inserted...");
	}
	
	public void get() {
		String query = "select * from question";
		List data = template.queryForList(query);
		System.out.println(data);
	}
	
	public void update() {
		String query = "update question set title = 'What is core java?' where id = 1";
		int count = template.update(query);
		System.out.println(count + " : rows updated...");
	}
	
	
	public void delete() {
		String query = "delete from question where id = 1";
		int count = template.update(query);
		System.out.println(count + " : rows deleted...");
	}
	
	
	
}
