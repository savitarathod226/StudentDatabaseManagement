package com.aarya.studentdb.service;

import java.util.List;

import com.aarya.studentdb.entity.Student;

public interface StudentService {
		//get student information by student rollno
		public Student getStudByRollNo(Integer studRollNo);
		//get all student information
		public List<Student> getAll();
		//save student information
		public void saveStudent(Student student);
		//save all student information in database
		public void saveAllStudent(List<Student> studentList);
		//update student database by student rollno 
		public void updateStudByRollNo(Student student);
		//delete student record by student rollno
		public void deleteStudByRollNo(Integer studRollNo);
		//delete all student record
		public void deleteAllStudent();
}
