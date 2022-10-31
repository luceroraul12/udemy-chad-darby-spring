package first;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private List<String> myStrings = Arrays.asList("hi", "Hello", "Good Morning", "Good Evening", "Good Afternoon");

    @Override
    public String getFortune() {
        Random random = new Random();
        int index = (int) (Math.random() * myStrings.size());
        return myStrings.get(index);
    }


}
