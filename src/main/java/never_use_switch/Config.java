package never_use_switch;

import com.github.javafaker.Faker;
import com.github.javafaker.GameOfThrones;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Random;

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




    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);
    }
}
