package ru.shumilin.spring.postProcessor.validatorPostProcessor;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.shumilin.annotations.ValidateNotPassedException;

@Lazy
@Component
public class HumanAgeValidator implements Validateable<Human>{
    @Override
    public void validate(Human obj) {
        if(obj.getAge() < 0) throw new ValidateNotPassedException("Age must be more than zero");
    }
}
