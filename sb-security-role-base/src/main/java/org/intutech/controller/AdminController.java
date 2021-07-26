package org.intutech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

	// localhost:8080/admin/details
	@GetMapping("/details")
	public String getAdminDetails() {
		return "Hi.. This is Admin Details endpoint";
	}
		
}
