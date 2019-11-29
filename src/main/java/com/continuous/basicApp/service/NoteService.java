package com.continuous.basicApp.service;

import java.util.List;

import com.continuous.basicApp.model.Note;

public interface NoteService {

	
	public Note findById(Long id);
	
	public Note createNote(Note note);
	
	public List<Note> findAll();
	
	public Note updateNote(Long id, Note note);
	
	public void deleteById(Long id);

}
