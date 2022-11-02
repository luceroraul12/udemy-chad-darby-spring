package first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PotatoCoach implements Coach {

    private FortuneService fortuneService;

    public PotatoCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "I'm potato coach and I want to work with you uwu.";
    }

    @Override
    public String getDailyForutne() {
        return this.fortuneService.getFortune();
    }
}
