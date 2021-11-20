package com.sakna.JavaRest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sakna.JavaRest.model.Student;
import com.sakna.JavaRest.repository.StudentRepository;
import com.sakna.JavaRest.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public long updateStudent(Student student) {
		return studentRepository.updateStudentDetails(student.getFirstName(), student.getLastName(), student.getEmail(), student.getId());
	}

	@Override
	public void deleteStudent(long id) {
		studentRepository.delete(studentRepository.getById(id));
	}

}
