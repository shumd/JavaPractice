package ru.shumilin.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.shumilin.spring.trafficLight.color.Color;
import ru.shumilin.university.Student;

import java.util.*;
import java.util.function.Predicate;

@Configuration
public class Config {
    private final List<Integer> usedNumbers = new ArrayList<>();

    @Bean
    public String hello() {
        return "Hello World";
    }

    @Bean
    @Scope("prototype")
    public int random(@Qualifier("min") int min,
                      @Qualifier("max") int max) {
        boolean isEmpty = !(usedNumbers.size() == max-min);
        Random random = new Random();
        int randomNumber = random.nextInt(min,max+1);

        if(isEmpty){
            while(usedNumbers.contains(randomNumber)){
                randomNumber = random.nextInt(min,max);
            }
        }else {
            usedNumbers.clear();
        }

        usedNumbers.add(randomNumber);
        return randomNumber;
    }

    @Bean
    public Date date(){
        return new Date();
    }

    @Bean
    public Predicate<Integer> range(){
        return x -> x >= 2 && x <= 5;
    }

    @Bean
    public int min(){
        return 0;
    }
    @Bean
    public int max(){
        return 5;
    }

    @Bean
    public Review goodReview(){
        return new Review("Очень хорошо", 4);
    }
    @Bean
    public Review badReview(){
        return new Review("Сойдет", 3);
    }
    @Bean
    public Review randomReview(@Qualifier("random") int random){
        return new Review("Сложно сказать", random);
    }

    @Bean
    public Review bestReview(List<Review> reviews){
        reviews.sort(Comparator.comparingInt(Review::getRating));
        return reviews.getLast();
    }

    @Bean
    public Student petyaStudent(@Qualifier("range") Predicate<Integer> range){
        return new Student("Petya",range,2,2,3,4);
    }
    @Bean
    public Student vasyaStudent(@Qualifier("range") Predicate<Integer> range) {
        return new Student("Vasya", range, 2,2, 2, 3, 4, 3);
    }

}
