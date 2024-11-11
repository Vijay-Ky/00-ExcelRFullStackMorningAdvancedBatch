package com.excelr.spring.boot.main.sport;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Lazy
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