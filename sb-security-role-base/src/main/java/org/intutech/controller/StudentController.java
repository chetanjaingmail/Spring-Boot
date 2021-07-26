package org.intutech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	// localhost:8080/student/details
	@GetMapping("/details")
	public String getStudDetails() {
		return "Hi.. This is Student Details endpoint";
	}
	
	// localhost:8080/student/info
	@GetMapping("/info")
	public String getStudInfo() {
		return "Hi.. This is Student info endpoint";
	}
	
}
