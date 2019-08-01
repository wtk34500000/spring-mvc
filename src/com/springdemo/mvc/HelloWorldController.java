package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//To show the init html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//To process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
}
