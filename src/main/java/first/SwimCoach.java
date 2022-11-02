package first;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;
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
}
