package com.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/welcome")
	  public String getAllUsers() {
		String welcome = "Welcome to Rest Api";
		System.out.println("welcome");
	    return welcome;
	  }

}
