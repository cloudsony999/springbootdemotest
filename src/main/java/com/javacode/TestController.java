package com.javacode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public String callme() {
		return "<h1>I am Spring Boot running from Heroku Cloud!!!!</h1>";
	}

}
