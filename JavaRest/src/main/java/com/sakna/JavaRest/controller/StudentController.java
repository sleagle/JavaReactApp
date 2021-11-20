package com.sakna.JavaRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sakna.JavaRest.model.Student;
import com.sakna.JavaRest.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/get-all")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping("/student/create")
	public long createStudent(@RequestBody Student student)
	{
		return studentService.createStudent(student).getId();
	}
	
	@RequestMapping("/student/update")
	public long updateStudent(@RequestBody Student student)
	{
		return studentService.updateStudent(student);
	}
	
	@RequestMapping("/student/delete")
	public void updateStudent(@RequestParam long id)
	{
		studentService.deleteStudent(id);
	}
}
