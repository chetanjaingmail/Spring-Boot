package org.intutech.controller;

import java.util.List;

import org.intutech.bean.Bookmark;
import org.intutech.repository.BookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my-bookmark")
public class BookmarkController {

	@Autowired
	private BookmarkRepository repo; 
	
	@PostMapping("/create")
	public Bookmark saveBookmark(@RequestBody Bookmark bookmark) {
		return repo.save(bookmark);
	}
	
	
	@GetMapping("/get-by-name/{name}") // path variable
	//@GetMapping("/get-by-name") // Query/Request Parameter
	public List<Bookmark> getBookmarkByName(@PathVariable String name){
		return repo.findByTitle(name);
	}
	
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id) {
		repo.deleteById(id);
		return "Recode Deleted Successfully...";
	}
	
}















