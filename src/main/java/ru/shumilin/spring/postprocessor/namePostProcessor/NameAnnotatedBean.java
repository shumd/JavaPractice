package ru.shumilin.spring.postprocessor.namePostProcessor;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Name
@Data
public class NameAnnotatedBean {
    String name;
}
