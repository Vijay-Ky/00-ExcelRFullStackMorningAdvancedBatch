package com.excelr.spring.boot.main.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySuperRestController
{
    //endpoints
    //we can able to create any no. of endpoints
    @GetMapping("/excelr")
    public String excelr()
    {
        return "Hello To All From Rest Controller excelr Method!";
    }

    @GetMapping("/springCourse")
    public String springCourse()
    {
        return "Hello To All From Rest Controller springCourse Method!";
    }

    @GetMapping("/goodDay")
    public String goodDay()
    {
        return "Hello To All From Rest Controller goodDay Method!";
    }

    @GetMapping("/veryGoodDay")
    public String veryGoodDay()
    {
        return "Hello To All From Rest Controller veryGoodDay Method!";
    }
}

