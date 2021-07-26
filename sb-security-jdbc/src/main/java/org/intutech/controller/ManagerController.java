package org.intutech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class ManagerController {

	@GetMapping("/msg")
	public String getManagerMessage() {
		return "This is Message from Manager";
	}
	
}
