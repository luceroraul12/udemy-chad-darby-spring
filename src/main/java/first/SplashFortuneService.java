package first;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("splashFortuneService")
public class SplashFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today water is templatedd xddd";
    }
}
