package com.excelr.spring.data.jpa.main;

import com.excelr.spring.data.jpa.main.dao.StudentDAO;
import com.excelr.spring.data.jpa.main.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
	{
		return runner ->
		{
			updateStudent(studentDAO);
		};
	}

	private void updateStudent(StudentDAO studentDAO)
	{
		//retrieve student based on the id
		int studentId = 1;
		System.out.println("Getting student with ID: " + studentId);
		Student myStudent = studentDAO.findById(studentId);
		System.out.println("Got the ID with: " + myStudent);

		//change first name
		System.out.println("Updating student ...");
		myStudent.setFirstName("David");

		//update the student
		studentDAO.update(myStudent);


		//display the updated student
		System.out.println("Updated student: " + myStudent);

	}
}
