package com.continuous.basicApp;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BasicAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicAppApplication.class, args);
	}
		
	@Bean
	CommandLineRunner init(NoteRepository noteRepository) {
		
		return args -> {
			Stream.of("Nota1", "Nota2", "Nota3", "Nota3", "Nota4").forEach(title -> {
				Note note = new Note(title, title.toLowerCase() + " Contenido de la nota");
				noteRepository.save(note);
			});
			noteRepository.findAll().forEach(System.out::println);
		};
	}

}
