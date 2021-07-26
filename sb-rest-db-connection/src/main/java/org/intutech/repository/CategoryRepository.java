package org.intutech.repository;

import java.util.List;

import org.intutech.bean.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//create table category(id int primary key auto_increment, name varchar(10), description varchar(20));
@Repository
public class CategoryRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public int save(Category category) {
		String query = "insert into category values(0,?,?)";
		Object [] data = {category.getName(), category.getDescription()}; 
		int count = jdbcTemplate.update(query, data);
		return count;
	}
	
	
	public List<Category> getAll(){
		String query = "select * from Category";
		List<Category> list = jdbcTemplate.query(query, new BeanPropertyRowMapper(Category.class));
		return list;
	}
	
	
	public int edit(Category category) {
		String query ="update category set name=?, description=? where id=?";
		Object[] data = {category.getName(), category.getDescription(), category.getId()};
		int count = jdbcTemplate.update(query,data);
		return count;
	}
	
	public int delete(int id) {
		String query = "delete from category where id=?";
		int count = jdbcTemplate.update(query, id);
		return count;
	}
	
	
	
}













