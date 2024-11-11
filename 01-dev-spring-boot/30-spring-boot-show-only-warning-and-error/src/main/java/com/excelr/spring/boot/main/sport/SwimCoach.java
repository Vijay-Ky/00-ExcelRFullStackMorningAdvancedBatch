package com.excelr.spring.boot.main.sport;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class SwimCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "practice backward swimming";
    }
}