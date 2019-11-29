package com.continuous.basicApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.continuous.basicApp.model.Note;

//Crud repository
@Repository
public interface NoteRepository extends CrudRepository<Note, Long>, JpaRepository<Note, Long>{

}
