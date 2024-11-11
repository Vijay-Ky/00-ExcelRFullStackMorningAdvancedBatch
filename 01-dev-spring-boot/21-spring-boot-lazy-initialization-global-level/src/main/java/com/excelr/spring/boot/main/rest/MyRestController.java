package com.excelr.spring.boot.main.rest;

import com.excelr.spring.boot.main.sport.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController
{
    private Coach myCoach;

    @Autowired
    public void setBean(@Qualifier("tennisCoach") Coach theCoach)
    {
        myCoach = theCoach;
        System.out.println("from constructor MyRestController theCoach value: " + myCoach);
    }

    @GetMapping("/myworkout")
    public String getAvailableDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}