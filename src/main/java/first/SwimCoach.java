package first;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Its a nice day to work until dinner";
    }

    @Override
    public String getDailyForutne() {
        return "I suppose I work great";
    }

    public String getEmail() {
        return this.email;
    }
    public String getTeam() {
        return this.team;
    }

}
