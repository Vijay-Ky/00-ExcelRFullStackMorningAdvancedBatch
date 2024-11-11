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
			createMultipleStudents(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO)
	{
		System.out.println("Creating student objects . . . ");
		Student tempStudent1 = new Student("Enrique", "Iglesias", "engrique@hollywood.com");
		Student tempStudent2 = new Student("Taylor", "Swift", "taylor@hollywood.com");
		Student tempStudent3 = new Student("Nicky", "Minaj", "nicky@hollywood.com");
		Student tempStudent4 = new Student("Drake", "Singer", "drake@hollywood.com");

		System.out.println("Saving student objects . . .");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent4);

		System.out.println("Saved student, Generated ID: " + tempStudent1.getId());
		System.out.println("Saved student, Generated ID: " + tempStudent2.getId());
		System.out.println("Saved student, Generated ID: " + tempStudent3.getId());
		System.out.println("Saved student, Generated ID: " + tempStudent4.getId());
	}
}
