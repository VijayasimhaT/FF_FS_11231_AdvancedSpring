package com.hcl.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")  
	public String home() {
		return "index";
	}

	@GetMapping("/java-course")
	public String course() {
		return "course";
	}

	@GetMapping("/premium-courses")
	public String premiumCourse() {
		return "premium-courses";
	}
	@GetMapping("/dba")
	public String dba() {
		return "dba";
	}
	@GetMapping("/dotnet")
	public String dotnet() {
		return "dotnet";
	}
}
