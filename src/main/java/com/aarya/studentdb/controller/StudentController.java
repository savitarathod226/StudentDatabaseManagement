package com.aarya.studentdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aarya.studentdb.entity.Student;
import com.aarya.studentdb.service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentController {
	
	@Autowired 
	private StudentService service;
	
	@GetMapping("/student/{studRollNo}")
	public Student getStudByRollNo( @PathVariable("studRollNo") Integer studRollNo) {
		return service.getStudByRollNo(studRollNo);
	} 
	
	@GetMapping("/getAll")
	public List<Student> getAll(){
		return service.getAll();
	}
	
	@PostMapping("/student/{stud}")
	public String saveStudent(@RequestBody Student stud) {
		service.saveStudent(stud);
		return "Student Data Saved";
	}
	
	@PostMapping("/saveAll")
	public String saveAllStudent(List<Student> studentList) {
		service.saveAllStudent(studentList);
		return "All Student Data Saved";
	}
	
	@PutMapping("/students")
	public void updateStudByRollNo(@RequestBody Student students) {
		service.updateStudByRollNo(students);
	}
	
	@DeleteMapping("/delete")
	public void deleteAllStudent() {
		service.deleteAllStudent();
	}
	
	@DeleteMapping("/student/{studRollNo}")
	public void deleteStudByRollNo(@PathVariable("studRollNo") Integer studRollNo) {
		service.deleteStudByRollNo(studRollNo);
	}
}
