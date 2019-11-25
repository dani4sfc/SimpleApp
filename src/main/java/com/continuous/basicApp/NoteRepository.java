package com.continuous.basicApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Crud repository
@Repository
public interface NoteRepository extends CrudRepository<Note, Long>, JpaRepository<Note, Long>{

}
