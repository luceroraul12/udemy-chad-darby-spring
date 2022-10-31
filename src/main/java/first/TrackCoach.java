package first;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyForutne() {
        return "From TrackCoach" +fortuneService.getFortune();
    }

//    @Override
    public void initMethod() {
        System.out.println("init on track coach");
    }

//    @Override
    public void destroyMethod() {
        System.out.println("destroy on track coach");
    }
}
