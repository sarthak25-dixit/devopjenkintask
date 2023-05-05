package com.nagarro.devop.devopAssignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/sarthak")
	public String getAnswer() {
		return "Hi SArthak Devop demo started";
	}
	
	@GetMapping("/abhishek")
	public String getAnswer1() {
		return "Hi Abhishek devop started";
	}
	
	@GetMapping("/satyam")
	public String getAnswer2() {
		return "Hi satyam devop started";
	}
}
