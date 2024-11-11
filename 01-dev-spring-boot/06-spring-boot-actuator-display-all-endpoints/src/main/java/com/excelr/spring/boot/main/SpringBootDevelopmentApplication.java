package com.excelr.spring.boot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDevelopmentApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootDevelopmentApplication.class, args);
		System.out.println("Welcome to spring boot app");
	}
}
