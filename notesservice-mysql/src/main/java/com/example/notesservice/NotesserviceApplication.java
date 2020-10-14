package com.example.notesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication(scanBasePackages = "com.example.notesservice")
//@EnableJpaRepositories(basePackages = "com.example.notesservice.repo")
//@EntityScan("com.example.notesservice.model")
@SpringBootApplication
public class NotesserviceApplication {
	public static void main(String[] args) {

	SpringApplication.run(NotesserviceApplication.class, args);
	}
	
	
}