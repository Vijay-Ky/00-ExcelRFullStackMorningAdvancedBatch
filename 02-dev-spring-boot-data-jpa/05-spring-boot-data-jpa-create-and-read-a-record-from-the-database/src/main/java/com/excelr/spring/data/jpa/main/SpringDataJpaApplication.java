package com.excelr.spring.data.jpa.main;

import com.excelr.spring.data.jpa.main.dao.StudentDAO;
import com.excelr.spring.data.jpa.main.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
			readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO)
	{
		System.out.println("Create new student object . . . ");
		Student tempStudent = new Student("Swathi", "Sharma", "swathi@swathi.com");

		System.out.println("Saving student object . . .");
		studentDAO.save(tempStudent);

		int theId = tempStudent.getId();
		System.out.println("Saved student. Generate id: " + theId);

		//retrieve student based on the id
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		//dispaly student
		System.out.println("Found the student: " + myStudent);
	}
}
