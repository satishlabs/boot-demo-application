package com.boot.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.ms.model.Student;
import com.boot.ms.service.StudentService;

@RestController
public class MainController {
	
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String greeting() {
		return "Hello Spring Boot";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String greeting1() {
		return "Hello Spring Boot from , POST";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ResponseEntity<Student> fetchStudent(@RequestParam int id){
		Student student = studentService.fetchStudentById(id);
		if(student == null) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok().body(student);
		}
	}
}
