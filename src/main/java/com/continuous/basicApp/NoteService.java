package com.continuous.basicApp;

import java.util.List;

public interface NoteService {

	
	public Note findById(Long id);
	
	public Note createNote(Note note);
	
	public List<Note> findAll();
	
	public Note updateNote(Long id, Note note);
	
	public void deleteById(Long id);

}
