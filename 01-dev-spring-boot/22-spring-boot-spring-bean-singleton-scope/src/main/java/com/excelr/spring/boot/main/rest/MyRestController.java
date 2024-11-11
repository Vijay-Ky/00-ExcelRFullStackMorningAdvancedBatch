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
    private Coach myAnotherCoach;

    @Autowired
    public void setBean(@Qualifier("tennisCoach") Coach theCoach, @Qualifier("tennisCoach") Coach theAnotherCoach)
    {
        myCoach = theCoach;
        myAnotherCoach = theAnotherCoach;
        System.out.println("from constructor MyRestController theCoach value: " + myCoach);
    }

    @GetMapping("/myworkout")
    public String getAvailableDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/checkScope")
    public String checkBeanScopes()
    {
        return  "comparing reference: myCoach and myAnotherCoach " + (myCoach == myAnotherCoach);
    }
}