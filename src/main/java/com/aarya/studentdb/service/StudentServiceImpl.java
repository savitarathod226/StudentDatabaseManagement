package com.aarya.studentdb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aarya.studentdb.entity.Student;
import com.aarya.studentdb.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private final StudentRepository repository;
	public StudentServiceImpl(StudentRepository repository) {
		this.repository = repository;
	}
	@Override
	public Student getStudByRollNo(Integer studRollNo) {
		Student student = repository.findById(studRollNo).orElse(null);
		return student;
	}

	@Override
	public List<Student> getAll() {
		Iterable<Student> iterable = repository.findAll();
		List<Student> list = new ArrayList<Student>();
		iterable.forEach(s->list.add(s));
		return list;
	}

	@Override
	public void saveStudent(Student student) {
		repository.save(student);
	}

	@Override
	public void saveAllStudent(List<Student> studentList) {
		repository.saveAll(studentList);
	}

//	public void updateStudByRollNo(Student student) {
//		Student student1 = repository.findById(studRollNo).orElse(null);
//		student1.setStudName(studName);
//		student1.setAddress(address);
//		student1.setStudClass(studClass);
//		repository.save(student);
//	}
	
	@Override
	public void deleteAllStudent() {
		repository.deleteAll();
	}
	@Override
	public void deleteStudByRollNo(Integer studRollNo) {
		repository.deleteById(studRollNo);
		
	}
	@Override
	public void updateStudByRollNo(Student student) {
		repository.save(student);
		
	}
	


}
