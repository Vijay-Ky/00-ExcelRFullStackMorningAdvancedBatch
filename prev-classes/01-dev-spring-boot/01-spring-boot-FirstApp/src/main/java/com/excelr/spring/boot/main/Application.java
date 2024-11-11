package com.excelr.spring.boot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
		System.out.println("Hello World! from Spring Boot Application");
	}
}
