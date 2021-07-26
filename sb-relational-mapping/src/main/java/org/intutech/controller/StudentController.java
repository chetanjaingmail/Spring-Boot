package org.intutech.controller;

import java.util.List;

import org.intutech.bean.Student;
import org.intutech.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studRepo;
	
	// localhost:8080/student/save
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student stud) {
		return studRepo.save(stud);
	}
	
	// localhost:8080/student/get-all
	@GetMapping("/get-all")
	public List<Student> getAllStudents(){
		return studRepo.findAll();
	}
	
	
	
}
