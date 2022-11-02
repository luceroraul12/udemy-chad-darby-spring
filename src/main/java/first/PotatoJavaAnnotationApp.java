package first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PotatoJavaAnnotationApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WaterConfig.class);

        Coach coach = context.getBean("potatoCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyForutne());


    }

}
