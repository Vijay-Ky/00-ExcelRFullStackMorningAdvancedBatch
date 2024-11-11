package com.excelr.spring.boot.main.sport;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    public TennisCoach()
    {
        System.out.println("From constructor: " + getClass().getName());
    }

    @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println("from doMyStartupStuff(): " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff()
    {
        System.out.println("from doMyCleanupStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout()
    {
        return "TennisCoach: Practice smashing for 30minutes";
    }
}