package com.excelr.spring.boot.main.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController
{
    @GetMapping("/")
   public String welcome()
   {
       return "welcome to our spring boot application! having fun and enjoying";
   }

    @GetMapping("/people")
    public String people()
    {
        return "welcome to our spring boot application people!";
    }
}
