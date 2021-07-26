package org.intutech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
	
	@Autowired
	private JdbcTemplate template;
	
	public void getQuestions() {
		List list = template.queryForList("select * from question");
		System.out.println(list);
	}
}
