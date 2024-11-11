package com.excelr.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DemoSpringBootApplication.class, args);
        System.out.println("Hello World! from Spring Boot Application");
    }
}
