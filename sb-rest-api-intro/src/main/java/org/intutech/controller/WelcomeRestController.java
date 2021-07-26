package org.intutech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping(value = "/welcome")
	public String getWelcomeMesasge() {
		return "Welcome To First Rest API (Rest Endpoint)";
	}
	
	@GetMapping(value = "/bye")
	public String getByeMessage() {
		return "Closing Rest Endpoint... Bye...";
	}
	
}
