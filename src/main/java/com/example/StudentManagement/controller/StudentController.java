package com.example.StudentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

	@GetMapping("/")
	public String helloMsg() {
		return "Hello Sandip, Good Morning";
	}
}
