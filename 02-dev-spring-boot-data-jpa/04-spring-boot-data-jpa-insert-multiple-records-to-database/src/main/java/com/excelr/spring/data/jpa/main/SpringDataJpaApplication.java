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
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO)
	{
		System.out.println("Create new student object . . . ");
		Student tempStudent = new Student("Tom", "Cruise", "tom@hollywood.com");

		System.out.println("Saving student object . . .");
		studentDAO.save(tempStudent);

		System.out.println("Saved student, Generated ID: " + tempStudent.getId());
	}
}
