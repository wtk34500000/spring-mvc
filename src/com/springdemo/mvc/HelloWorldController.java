package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
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
	
	//read form data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//read the request para from html form
		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName= theName.toUpperCase();	
		
		//create the message
		String result = "Yo! "+ theName;
		
		// add message to model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, 
			Model model) {	
		
		//convert the data to all caps
		theName= theName.toUpperCase();	
		
		//create the message
		String result = "Hey My Friend from v3! "+ theName;
		
		// add message to model
		model.addAttribute("message", result);
		return "helloworld";
	}
}
