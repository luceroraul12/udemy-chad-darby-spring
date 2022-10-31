package first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applitacionContext.xml");

        Coach trackCoach = context.getBean("myTrackCoach", Coach.class);
        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);

        trackCoach.getDailyWorkout();
        trackCoach.getDailyWorkout();
        trackCoach.getDailyWorkout();
        cricketCoach.getDailyWorkout();
        cricketCoach.getDailyWorkout();
        cricketCoach.getDailyWorkout();
        cricketCoach.getDailyWorkout();
        cricketCoach.getDailyWorkout();
        cricketCoach.getDailyWorkout();
        cricketCoach.getDailyWorkout();


        context.close();
    }
}
