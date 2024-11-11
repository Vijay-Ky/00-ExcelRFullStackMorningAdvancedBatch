package com.excelr.spring.boot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"com.excelr.spring.boot.main", "com.excelr.spring.util"})
//@SpringBootApplication(scanBasePackages = {"com.excelr.spring.boot.main", "com.excelr.spring"})
//@SpringBootApplication(scanBasePackages = {"com.excelr.spring", "in.vijay.util"})
//@SpringBootApplication(scanBasePackages = {"in.vijay.util"})
@SpringBootApplication(scanBasePackages = {"com", "in"})
public class SpringBootDevelopmentApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootDevelopmentApplication.class, args);
		System.out.println("Welcome to spring boot app");
	}
}
