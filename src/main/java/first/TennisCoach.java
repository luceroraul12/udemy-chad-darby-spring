package first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Let's work until afternoon";
    }

    @Override
    public String getDailyForutne() {
        return fortuneService.getFortune();
    }
}
