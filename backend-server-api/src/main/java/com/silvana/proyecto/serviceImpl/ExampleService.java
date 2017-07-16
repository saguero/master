package com.silvana.proyecto.serviceImpl;

import org.springframework.stereotype.Component;

import com.silvana.proyecto.service.Service;


/**
 * {@link Service} with hard-coded input data.
 */
@Component
public class ExampleService implements Service {
	
	/**
	 * Reads next record from input
	 */
	public String getMessage() {
		return "Hello world!";	
	}

}
