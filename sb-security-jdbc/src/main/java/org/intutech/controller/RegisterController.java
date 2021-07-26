package org.intutech.controller;

import org.intutech.bean.Register;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

	@PostMapping("/register")
	public Register registerUser(Register register) {
		System.out.println("Register user.....");
		return register;
	}
	
}
