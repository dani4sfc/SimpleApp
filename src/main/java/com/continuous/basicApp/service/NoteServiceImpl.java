package com.continuous.basicApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.continuous.basicApp.model.Note;
import com.continuous.basicApp.repository.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService{
	
	
	@Autowired
	private NoteRepository repository;
	
	@Override
	public Note findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Note createNote(Note note) {
		return repository.save(note);
	}

	@Override
	public List<Note> findAll() {
		return repository.findAll();
	}

	//Update needs to bring a id in order to identify the element (visual), first parameter, the id
	@Override
	public Note updateNote(Long id, Note note) {
		
		Note current = this.findById(id);
		
		if(!current.equals(null)) {
			
			current.setBody(note.getBody());
			current.setTitle(note.getTitle());
			
		}else {
			return null;
		}
		
		return repository.saveAndFlush(current);
		
	}

	@Override
	public void deleteById(Long id) {
		
		if(!repository.findById(id).equals(null)) {
			repository.deleteById(id);

		}
		
		
	}



}
