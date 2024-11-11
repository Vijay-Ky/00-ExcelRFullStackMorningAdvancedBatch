package com.excelr.spring.boot.main.sport;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach
{
    public TrackCoach()
    {
        System.out.println("From constructor: " + getClass().getName());
    }

    //define our init method
    @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println("from doMyStartupStuff(): " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanupStuff()
    {
        System.out.println("from doMyCleanupStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout()
    {
        return "Run for 5Kms";
    }
}