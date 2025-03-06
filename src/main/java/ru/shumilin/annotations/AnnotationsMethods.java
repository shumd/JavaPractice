package ru.shumilin.annotations;

import lombok.SneakyThrows;
import ru.shumilin.tests.TestNotPassedException;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnotationsMethods {
    @SneakyThrows
    public static Map<String, Object> collect(Class<?>... values){
        Map<String, Object> res = new HashMap<>();

        for(Class<?> clazz : values){
            for(Method m : clazz.getDeclaredMethods()){
                m.setAccessible(true);
                if(m.getReturnType() != void.class &&
                        m.getParameterTypes().length == 0 &&
                        m.isAnnotationPresent(Invoke.class)){
                    Constructor<?> constructor =  clazz.getConstructor(null);
                    res.put(m.getName(), m.invoke(constructor.newInstance()));
                }
            }
        }

        return res;
    }

    @SneakyThrows
    public static void validate(Object... objects){
        for(Object object : objects){
            Class<?> clazz = object.getClass();
            Validate validateAnnotation = null;

            for(Annotation annotation : clazz.getDeclaredAnnotations()){
                if(annotation.annotationType().equals(Validate.class)){
                    validateAnnotation = (Validate) annotation;
                    break;
                } else if (annotation.annotationType().isAnnotationPresent(Validate.class)) {
                    validateAnnotation = annotation.annotationType().getAnnotation(Validate.class);
                    break;
                }
            }

            if(validateAnnotation == null){
                continue;
            }

            Class<?>[] testClasses = validateAnnotation.value();

            for(Class<?> testClass : testClasses){
                List<Method> testMethods = new ArrayList<>();
                Object testObj = testClass.getDeclaredConstructor(null).newInstance();

                for(Method method : testClass.getDeclaredMethods()){
                    method.setAccessible(true);
                    if(method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == object.getClass()){
                        testMethods.add(method);
                    }
                }

                for(Method test : testMethods){
                    try{
                        test.invoke(testObj,object);
                    }catch(InvocationTargetException e){
                        throw e.getCause();
                    }
                }
            }
        }
    }
}
