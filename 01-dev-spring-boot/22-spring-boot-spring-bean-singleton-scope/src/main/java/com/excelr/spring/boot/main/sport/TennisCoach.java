package com.excelr.spring.boot.main.sport;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    public TennisCoach()
    {
        System.out.println("From constructor: " + getClass().getName());
    }

    @Override
    public String getDailyWorkout()
    {
        return "TennisCoach: Practice smashing for 30minutes";
    }
}