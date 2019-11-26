package com.continuous.basicApp;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

//
@RequestMapping(value = "/notes")

public class NoteController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NoteController.class);

	@Autowired
	private NoteServiceImpl service;
	
	
	@GetMapping(path= "/{id}")
	public Note findNoteById(@PathVariable(value = "id") Long id) {
		return service.findById(id);
	}
	
	//In generic methods, let the / path
	@GetMapping(path= "/")
	public List<Note> getNotes(){
		return (List<Note>) service.findAll();
	}

		
	@PostMapping(path="/")
	public Note addNote (@RequestBody Note note) {
		return service.createNote(note);
	}
	

	//Adapt id with the note.id
	@PutMapping(path="/{id}")
	public Note updateNote(@PathVariable(value="id")Long id, @RequestBody Note note) {
				
		if(note.getId( )== id) {
			return service.updateNote(id, note);

		}else {
			return null;
		}
	}
	
	
	@DeleteMapping(path="/deleteNote/{id}")
	public void deleteNoteById (@PathVariable(value = "id") long id) {
		
		service.deleteById(id);
	}
	
	
}
