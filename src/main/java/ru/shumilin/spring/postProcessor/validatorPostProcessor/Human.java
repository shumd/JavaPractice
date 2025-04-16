package ru.shumilin.spring.postProcessor.validatorPostProcessor;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@HumanAgeValidate
@Component
public class Human {
    private int age = 2;
}
