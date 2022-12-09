package com.aarya.studentdb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aarya.studentdb.entity.Student;
import com.aarya.studentdb.service.StudentServiceImpl;

@SpringBootApplication
public class StudentDatabaseManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StudentDatabaseManagementApplication.class, args);
	//	StudentServiceImpl serviceImpl = context.getBean(StudentServiceImpl.class);
//		Student student = new Student("Ram","Pune","10th");
//		serviceImpl.saveStudent(student);
//		List<Student> list = new ArrayList<Student>();
//		list.add(new Student("Sham", "Pune", "12th"));
//		list.add(new Student("Ram","Pune","10th"));
//		list.add(new Student("Anjali","Pune","10th"));
//		list.add(new Student("Pranali","Pune","12th"));
//		list.add(new Student("Praveen","Pune","10th"));
//		serviceImpl.saveAllStudent(list);
//		serviceImpl.deleteStudByRollNo(1);
		
	}

}
