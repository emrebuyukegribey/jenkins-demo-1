package com.emre.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "hello from home";
	}
}
