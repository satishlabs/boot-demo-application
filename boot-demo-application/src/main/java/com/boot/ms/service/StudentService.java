package com.boot.ms.service;

import com.boot.ms.model.Student;

public interface StudentService {
	
	public Student save(Student student);
	public Student fetchStudentById(int id);
	
}
