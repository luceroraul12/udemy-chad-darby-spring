package first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(coach);
        System.out.println(coach.getDailyForutne());
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());


    }
}
