package first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigurationDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean isSameCoach = coach.equals(alphaCoach);
        System.out.println("Is the same coach ? "+isSameCoach);


    }
}
