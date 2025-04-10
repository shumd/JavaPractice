package ru.shumilin.spring.postProcessor.validatorPostProcessor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Validate(ruleName = "humanAgeValidator")
@Retention(RetentionPolicy.RUNTIME)
public @interface HumanAgeValidate {
}
