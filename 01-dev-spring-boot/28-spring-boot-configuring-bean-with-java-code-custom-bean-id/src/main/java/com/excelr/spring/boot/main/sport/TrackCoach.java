package com.excelr.spring.boot.main.sport;

public class TrackCoach implements Coach
{

    @Override
    public String getDailyWorkout()
    {
        return "Run for 5Kms";
    }
}