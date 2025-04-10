package ru.shumilin.spring.postProcessor.validatorPostProcessor;

public interface Validateable <T>{
    public void validate(T obj);
}
