package com.sakna.JavaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sakna.JavaRest.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	@Modifying
	@Query("update Student s set s.firstName = ?1, s.lastName = ?2, s.email = ?3 where s.id = ?4")
	int updateStudentDetails(String firstName, String lastName, String email, long id);
}