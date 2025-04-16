package ru.shumilin.spring.postProcessor.defaultBeanPostProcessor;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class DefaultBeanPostProcessor implements BeanPostProcessor {
    private ApplicationContext ctx;

    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = bean.getClass();

        if(clazz.isAnnotationPresent(Default.class)){
            String annotationBeanName = clazz.getAnnotation(Default.class).value();
            Object obj = ctx.getBean(annotationBeanName);

            Field[] fields = clazz.getDeclaredFields();
            Method[] methods = obj.getClass().getMethods();

            Map<Class, Method> map = Arrays.stream(methods)
                    .collect(Collectors.toMap(Method::getReturnType,
                            m -> m));

            for(Field field : fields){
                field.setAccessible(true);
                field.set(bean, map.get(field.getType()));
            }

            //
        }
        return bean;
    }
}
