package com.excelr.spring.boot.main.config;

import com.excelr.spring.boot.main.sport.Coach;
import com.excelr.spring.boot.main.sport.SwimCoach;
import com.excelr.spring.boot.main.sport.TennisCoach;
import com.excelr.spring.boot.main.sport.TrackCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig
{
    @Bean
    public Coach tennisCoach()
    {
        return new TennisCoach();
    }

    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach();
    }

    @Bean
    public Coach trackCoach()
    {
        return new TrackCoach();
    }
}
