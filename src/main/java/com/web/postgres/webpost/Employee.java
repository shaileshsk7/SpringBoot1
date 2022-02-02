package com.web.postgres.webpost;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Employee {

	
	@GetMapping("/customer")
	@ResponseBody 
	public String welcome() {
		return "Welcome to String boot Web project";
		
	}
	
	
		
}
