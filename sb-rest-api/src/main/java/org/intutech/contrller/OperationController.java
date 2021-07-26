package org.intutech.contrller;

import java.util.ArrayList;
import java.util.List;

import org.intutech.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {
	
	public static List<Student> studentList = new ArrayList<Student>();
	
	@GetMapping("/get-all")
	public List<Student> getStudentDetails(){
		return studentList;
	}
	
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student stud) {
		
		studentList.add(stud);
		return "Student save successfully....";
	}
}
