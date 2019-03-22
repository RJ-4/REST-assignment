package com.glaucus.java.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Assignment Application serves as the main class of this project from where the execution starts.
 * 
 * @author Rishabh Jain
 *
 */
@SpringBootApplication
public class AssignmentApplication {

	/**
	 * Starts the execution of the project
	 * @param args used for processing of command-line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

}
