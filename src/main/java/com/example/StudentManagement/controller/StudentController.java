package com.example.StudentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.StudentManagement.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/hello")
	public ResponseEntity helloMsg() {
		 String string = studentService.getStudentRecord();
		 return new ResponseEntity<String>(string,HttpStatus.OK);
	}
}
