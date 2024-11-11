package com.excelr.spring.boot.main.sport;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class SwimCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "practice backward swimming";
    }
}
