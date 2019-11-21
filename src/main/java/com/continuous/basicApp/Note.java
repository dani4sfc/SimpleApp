package com.continuous.basicApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Note {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

	//Set these name and email to final if something fails
	private String title;
    private String note;
     

	public Note(String title, String note) {
		super();
		this.title = title;
		this.note = note;
	}
	
	public Note() {
		super();
	}
    
    
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public String getNote() {
		return note;
	}

    @Override
	public String toString() {
		return "Title [id=" + id + ", title=" + title + ", note=" + note + "]";
	}
	
}
