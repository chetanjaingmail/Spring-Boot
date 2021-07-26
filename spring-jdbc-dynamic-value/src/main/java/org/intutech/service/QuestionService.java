package org.intutech.service;

import java.util.List;

import org.intutech.bean.Question;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class QuestionService {

	private JdbcTemplate temp;
	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	
	public void saveQuestion(Question q) {
		String query = "insert into question values(0,?,?,?)";
		Object[] data = {q.getTitle(),q.getQuesdesc(),q.getPostedon()};
		int count = temp.update(query,data);
		System.out.println(count + " : rows inserted..");
		//temp.update(query,q.getTitle(),q.getQuesdesc(),q.getPostedon());
	}
	
	public void updateQuestion(Question q) {
		String query = "update question set title=?, quesdesc=? where id = ?";
		Object[] values = {q.getTitle(), q.getQuesdesc(), q.getId()};
		int count = temp.update(query,values);
		System.out.println(count + " : rows updated...");
	}
	
	
	public void getQuestion() {
		String query = "select * from question";
		List list = temp.queryForList(query);
		System.out.println(list);
	}
	
	public void getQuestionsByRowMapper() {
		String query = "select * from question";
		List<Question> list = temp.query(query, new BeanPropertyRowMapper(Question.class));
		for(Question q : list) {
			System.out.println(q.getId());
			System.out.println(q.getTitle());
			System.out.println(q.getQuesdesc());
			System.out.println(q.getPostedon());
			System.out.println("=============================");
		}
	}
	
}


















