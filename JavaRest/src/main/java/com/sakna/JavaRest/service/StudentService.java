package com.sakna.JavaRest.service;

import java.util.List;

import com.sakna.JavaRest.model.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student createStudent(Student student);
	
	long updateStudent(Student student);
	
	void  deleteStudent(long id);
}
