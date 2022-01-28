package com.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String homeController() {
		System.out.println("We are the Home Controller in the project");
		return "We are the Home Controller in the project";
	}
}
