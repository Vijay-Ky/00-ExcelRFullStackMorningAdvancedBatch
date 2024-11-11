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
			queryForStudentsByLastName(studentDAO);
		};
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO)
	{
		//get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Doe");

		//display list of students
		for(Student tempStudent : theStudents)
		{
			System.out.println(tempStudent);
		}
	}
}
