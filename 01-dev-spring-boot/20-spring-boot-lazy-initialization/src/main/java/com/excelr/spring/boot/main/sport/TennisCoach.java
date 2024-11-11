package com.excelr.spring.boot.main.sport;

import com.excelr.spring.boot.main.sport.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Lazy
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