package com.sakna.JavaRest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakna.JavaRest.model.Student;
import com.sakna.JavaRest.repository.StudentRepository;
import com.sakna.JavaRest.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

}
