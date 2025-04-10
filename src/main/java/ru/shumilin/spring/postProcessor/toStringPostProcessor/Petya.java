package ru.shumilin.spring.postProcessor.toStringPostProcessor;

import org.springframework.stereotype.Component;
import ru.shumilin.annotations.ToString;

@Component
@ToString
public class Petya {
    private String surname = "Petrov";
    private String name = "Petya";
    private int age = 12;
}
