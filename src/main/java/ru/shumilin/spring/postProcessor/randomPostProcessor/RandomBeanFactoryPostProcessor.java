package ru.shumilin.spring.postProcessor.randomPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class RandomBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        if(!registry.containsBeanDefinition("random")){
            BeanDefinition beanDefinition = BeanDefinitionBuilder
                    .genericBeanDefinition(Integer.class, RandomSupplier.getInstance())
                    .setScope("prototype")
                    .getBeanDefinition();

            registry.registerBeanDefinition("random", beanDefinition);
        }
    }
}
