package com.boot.ms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.ms.model.Student;
import com.boot.ms.repository.StudentRepository;

@Service
public class StudentSeriveImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student save(Student student) {
		
		return studentRepository.save(student);
	}
	
	public Student fetchStudentById(int id) {
		Optional<Student> student =  studentRepository.findById(id);
		if(student.isPresent()) {
			return student.get();
		}
		return null;
	}

}
