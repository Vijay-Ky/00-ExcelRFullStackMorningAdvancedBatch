package com.excelr.spring.boot.main.sport;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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