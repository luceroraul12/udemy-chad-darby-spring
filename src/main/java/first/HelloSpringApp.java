package first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach theVideoGameCoach = context.getBean("myVideoGameCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theVideoGameCoach.getDailyWorkout());

        context.close();
    }
}