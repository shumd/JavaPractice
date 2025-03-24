package ru.shumilin.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;
import java.util.Random;
import java.util.function.Predicate;

@Configuration
public class Config {
    @Bean
    public String hello() {
        return "Hello World";
    }

    @Bean
    @Scope("prototype")
    public int random(){
        Random random = new Random();

        return random.nextInt(,99);
    }

    @Bean
    public Date date(){
        return new Date();
    }

    @Bean
    public Predicate<Integer> predicate(){
        return x -> x >= 2 && x <= 5;
    }

    @Bean
    public int min(){
        return 0;
    }
    @Bean
    public int max(){
        return 100;
    }
}
