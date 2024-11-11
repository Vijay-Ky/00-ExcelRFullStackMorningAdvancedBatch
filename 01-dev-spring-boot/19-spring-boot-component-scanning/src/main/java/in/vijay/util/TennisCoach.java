package in.vijay.util;

import com.excelr.spring.boot.main.sport.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "TennisCoach: Practice smashing for 30minutes";
    }
}
