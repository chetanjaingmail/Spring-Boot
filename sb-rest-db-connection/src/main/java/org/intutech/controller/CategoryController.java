package org.intutech.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.intutech.bean.Category;
import org.intutech.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	
	//localhost:8080/category/save
	@PostMapping("/category/save")
	public String save(@RequestBody Category category) {
		String msg = "Some Error Occurs while creating Category, Please try after some time....";
		
		int count = categoryRepository.save(category);
		
		if(count > 0) {
			msg = "Category created Successfully....";
		}
		
		return msg;
		
	}
	
	//localhost:8080/category/getall
	@GetMapping("/category/getall")
	public List<Category> getAll(){
		List<Category> list = categoryRepository.getAll();
		return list;
	}
	
	//localhost:8080//category/update
	@PutMapping("/category/update")
	public String update(@RequestBody Category category) {
		int count = categoryRepository.edit(category);
		if(count>0) {
			return "Record Updated Successfully";
		}else {
			return "Updation fail... Please try after some time..";
		}
	}
	
	//localhost:8080/category/delete?id=2
	/*@DeleteMapping("/category/delete")
	public String delete(@RequestParam int id) {
		int count = categoryRepository.delete(id);
		
		if(count>0) {
			return "Record Deleted Successfully";
		}else {
			return "Deletion fail... Please try after some time..";
		}
	}*/
	
	//localhost:8080/category/delete/1
	@DeleteMapping("/category/delete/{id}")
	public String delete(@PathVariable int id) {
		int count = categoryRepository.delete(id);
		
		if(count>0) {
			return "Record Deleted Successfully";
		}else {
			return "Deletion fail... Please try after some time..";
		}
	}
}




















