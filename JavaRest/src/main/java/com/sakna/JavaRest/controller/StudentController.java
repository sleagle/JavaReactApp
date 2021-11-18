package com.sakna.JavaRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakna.JavaRest.model.Student;
import com.sakna.JavaRest.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/get-all")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
}
