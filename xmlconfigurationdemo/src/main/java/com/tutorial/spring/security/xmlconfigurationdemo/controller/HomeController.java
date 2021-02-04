package com.tutorial.spring.security.xmlconfigurationdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
}