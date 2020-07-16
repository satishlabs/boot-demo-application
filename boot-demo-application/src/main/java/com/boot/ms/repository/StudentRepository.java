package com.boot.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.ms.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	
	//public Student save(Student student);
	
}
