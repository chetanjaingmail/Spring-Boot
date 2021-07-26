package org.intutech.controller;

import java.util.List;

import org.intutech.bean.Address;
import org.intutech.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@CrossOrigin(value = "*") // to allow angular to access Rest Endpoint  
public class AddressController {

	@Autowired
	private AddressRepository addRepo;
	
	// localhost:8080/address/save
	@PostMapping("/save")
	public Address save(@RequestBody Address add) {
		return addRepo.save(add);
	}
	
	// localhost:8080/address/get-all
	@GetMapping("/get-all")
	public List<Address> getAll(){
		return addRepo.findAll();
	}
	
}

