package first;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("first")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
