package ru.shumilin.spring.postProcessor.cachePostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import ru.shumilin.annotations.Cache;
import ru.shumilin.cache.CacheProxyCreator;

import java.lang.reflect.Method;

@Component
public class CacheBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        boolean isAnnotated = false;

        for(Method m : bean.getClass().getMethods()){
            m.setAccessible(true);
            if(m.isAnnotationPresent(Cache.class)){
                isAnnotated = true;
                break;
            }
        }

        return isAnnotated ? CacheProxyCreator.create(bean) : bean;
    }
}
