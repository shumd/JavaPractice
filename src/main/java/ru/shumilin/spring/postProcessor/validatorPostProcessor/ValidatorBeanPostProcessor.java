package ru.shumilin.spring.postProcessor.validatorPostProcessor;

import lombok.AllArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import java.lang.annotation.Annotation;
import java.util.Optional;

@Component
@AllArgsConstructor
public class ValidatorBeanPostProcessor implements BeanPostProcessor {
    private final ApplicationContext ctx;

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = bean.getClass();
        Validate validate = validateAnnotationFrom(bean).orElse(null);

        if(validate != null){
            Validateable<Object> validateable = ctx.getBean(validate.ruleName(), Validateable.class);
            validateable.validate(bean);
        }

        return bean;
    }

    private static Optional<Validate> validateAnnotationFrom(Object object) {
        for(Annotation annotation : object.getClass().getDeclaredAnnotations()) {
            if(annotation.annotationType().equals(Validate.class)) {
                return Optional.of((Validate) annotation);
            }
            if(annotation.annotationType().isAnnotationPresent(Validate.class)) {
                return Optional.of(annotation.annotationType().getAnnotation(Validate.class));
            }
        }

        return Optional.empty();
    }
}
