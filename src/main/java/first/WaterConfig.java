package first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WaterConfig {

    @Bean
    public FortuneService splashFortuneService(){
        return new SplashFortuneService();
    }

    @Bean
    public Coach potatoCoach() {
        return new PotatoCoach(splashFortuneService());
    }

}
