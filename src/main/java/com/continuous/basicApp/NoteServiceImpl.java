package com.continuous.basicApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public Note updateNote(Note note) {
		
		Note current = this.findById(note.getId());
		
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