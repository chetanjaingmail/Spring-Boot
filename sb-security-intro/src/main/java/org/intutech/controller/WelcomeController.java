package org.intutech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	//localhost:8080/first/page
	@GetMapping("/first/page")
	public String welcomeMsg() {
		return "Hello, Welcome To Spring Secutiry Application....";
	}
	
}
