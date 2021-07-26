package org.intutech.controller;

import java.util.List;

import org.intutech.bean.EducationalDetails;
import org.intutech.repository.EducationalDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/education")
public class EducationalDetailsController {

	@Autowired
	private EducationalDetailsRepo repo;
	
	// localhost:8080/education/save
	@PostMapping("/save")
	public EducationalDetails saveEduDetails(@RequestBody EducationalDetails eduDtl){
		return repo.save(eduDtl);
	}
	
	// localhost:8080/education/get-all
	@GetMapping("/get-all")
	public List<EducationalDetails> getAll(){
		return repo.findAll();
	}
	
}
