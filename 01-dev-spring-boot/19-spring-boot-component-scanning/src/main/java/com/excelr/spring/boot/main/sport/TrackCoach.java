package com.excelr.spring.boot.main.sport;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class TrackCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "Run for 5Kms";
    }
}
