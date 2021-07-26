package org.intutech.controller;

import java.util.List;

import org.intutech.bean.Student;
import org.intutech.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository repo;
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student stud) {
		return repo.save(stud);
	}
	
	@GetMapping("/getby/gender")
	public List<Student> getByGender(@RequestParam String gender){
		//return repo.getStudentsUsingGender(gender);
		return repo.getStudentsUsingGenderBySQL(gender);
	}
	
	@GetMapping("/getby/age/{age}")
	public List<Object> getByAge(@PathVariable int age){
		//return repo.getStudentUsingAge(age);
		return repo.getStudentUsingAgeBySql(age);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student stud) {
		return repo.save(stud);
	}
	
}
