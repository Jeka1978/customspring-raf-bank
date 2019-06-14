package never_use_switch;

import com.github.javafaker.Faker;
import com.github.javafaker.GameOfThrones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;
import java.util.Map;
import java.util.Random;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class Config {

    @Bean
    public Random random(){
        return new Random();
    }

    @Bean
    public GameOfThrones gameOfThrones(){
        return new Faker().gameOfThrones();
    }

   /* @Bean //if you want to inject this bean you must use qualifier
    public Map<String,Sender> senderMap(@Autowired  List<Sender> senders) {
        return senders.stream().collect(toMap(Sender::myType, a -> a));
    }*/




    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);
    }
}
