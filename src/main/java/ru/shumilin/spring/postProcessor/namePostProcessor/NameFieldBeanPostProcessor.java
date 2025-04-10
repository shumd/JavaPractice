package ru.shumilin.spring.postProcessor.namePostProcessor;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class NameFieldBeanPostProcessor implements BeanPostProcessor {
    @Override
    @SneakyThrows
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = bean.getClass();
        if(clazz.isAnnotationPresent(Name.class)) {
            for(Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                if(field.getName().equals("name") && field.get(bean) == null) {
                    field.set(bean, "vasia");
                }
            }
        }
        return bean;
    }
}
