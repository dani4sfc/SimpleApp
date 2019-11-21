package com.continuous.basicApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class NoteController {
	
	@Autowired
	private NoteRepository noteRepository;
	
	@GetMapping("/notes")
	public List<Note> getNotes(){
		return (List<Note>) noteRepository.findAll();
	}
	
	@PostMapping("/notes")
	void addNote (@RequestBody Note note) {
		noteRepository.save(note);
	}

}
