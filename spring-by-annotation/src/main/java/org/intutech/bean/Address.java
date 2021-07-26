package org.intutech.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller(value = "add")
public class Address {  // address
	public Address() {
		System.out.println("Address Object created...");
	}
}
