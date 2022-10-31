package first;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public CricketCoach() {
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyForutne() {
        return "By CricketCoach: "+fortuneService.getFortune();
    }

//    @Override
    public void initMethod() {
        System.out.println("init on Cricket coach");
    }

//    @Override
    public void destroyMethod() {
        System.out.println("destroy on Cricket coach");
    }
}
