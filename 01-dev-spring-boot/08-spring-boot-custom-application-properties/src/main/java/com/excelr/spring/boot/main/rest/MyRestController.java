package com.excelr.spring.boot.main.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController
{
    @Value("${excelr.trainer.name}")
    private String trainerName;

    @Value("${excelr.course.name}")
    private String courseName;

    @Value("${excler.course.duration}")
    private String courseDuration;

    @GetMapping("/AppInfo")
    public String getInfo()
    {
        return "<br/> Trainer Name: " + trainerName + "<br/> Course Name: " + courseName + "<br/> Course Duration: " + courseDuration;
    }
}
