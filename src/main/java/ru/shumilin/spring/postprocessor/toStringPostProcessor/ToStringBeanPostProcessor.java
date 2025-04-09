package ru.shumilin.spring.postprocessor.toStringPostProcessor;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import ru.shumilin.annotations.ToString;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Component
public class ToStringBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = bean.getClass();

        if(clazz.isAnnotationPresent(ToString.class)) {
            ProxyFactory proxyFactory = new ProxyFactory(bean);
            proxyFactory.setProxyTargetClass(true);

            proxyFactory.addAdvice((MethodInterceptor) invocation -> {
                if(invocation.getMethod().getName().equals("toString")) {
                    Class<?> beanClazz = bean.getClass();
                    List<String> fields = new ArrayList<>();
                    StringBuilder res = new StringBuilder(beanClazz.getSimpleName());
                    for(Field field : beanClazz.getDeclaredFields()) {
                        field.setAccessible(true);
                        fields.add(field.getName() + "=" + field.get(bean));
                    }
                    return res.append(fields).toString();
                }else{
                    return invocation.proceed();
                }
            });
            return proxyFactory.getProxy();
        }

        return bean;
    }
}
