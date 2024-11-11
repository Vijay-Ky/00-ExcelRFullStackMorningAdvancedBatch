package com.excelr.spring.boot.main.sport;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach
{
    public TrackCoach()
    {
        System.out.println("From constructor: " + getClass().getName());
    }

    @Override
    public String getDailyWorkout()
    {
        return "Run for 5Kms";
    }
}