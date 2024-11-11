package com.excelr.spring.boot.main.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController
{
    //endpoints
    //we can able to create any no. of endpoints
    @GetMapping("/")
    public String hello()
    {
        return "Hello To All From Rest Controller hello Method!";
    }

    @GetMapping("/helloWorld")
    public String helloWorld()
    {
        return "Hello To All From Rest Controller helloWorld Method!";
    }
}
