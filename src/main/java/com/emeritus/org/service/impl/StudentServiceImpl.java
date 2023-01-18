package com.emeritus.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emeritus.org.entity.Student;
import com.emeritus.org.repository.StudentRepository;
import com.emeritus.org.service.StudentService;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	@Autowired
	private EntityManager entityManager;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(String id)  {
		return studentRepository.findById(Long.valueOf(id)).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
