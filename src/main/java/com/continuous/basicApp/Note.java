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

	private String body;
     

	public Note(String title, String body) {
		super();
		this.title = title;
		this.body = body;
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
	public String getBody() {
		return body;
	}
	
    public void setTitle(String title) {
		this.title = title;
	}

	public void setBody(String body) {
		this.body = body;
	}

    @Override
	public String toString() {
		return "Title [id=" + id + ", title=" + title + ", note=" + body + "]";
	}
	
}
