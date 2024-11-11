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
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO)
	{
		System.out.println("creating new student objects...");
		Student tempStudent1 = new Student("John", "Doe", "john@john.com");
		Student tempStudent2 = new Student("Jane", "Doe", "jane@jane.com");

		System.out.println("Saving student objects ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);

		System.out.println("Saved student, Generated ID: " + tempStudent1.getId());
		System.out.println("Saved student, Generated ID: " + tempStudent2.getId());
	}
}
