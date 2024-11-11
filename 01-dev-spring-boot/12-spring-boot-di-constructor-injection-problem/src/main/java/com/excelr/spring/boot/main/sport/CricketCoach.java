package com.excelr.spring.boot.main.sport;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "CricketCoach: Practice batting for 30 minutes";
    }
}
