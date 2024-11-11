package com.excelr.spring.boot.main.sport;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CricketCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "CricketCoach: Practice batting for 30 minutes";
    }
}
