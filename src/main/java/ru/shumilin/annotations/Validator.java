package ru.shumilin.annotations;

import lombok.SneakyThrows;
import ru.shumilin.tests.TestNotPassedException;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Validator {
    public static void validate(Object... objects) {
        for (Object object : objects) {
            validate(object);
        }
    }

    @SneakyThrows
    private static void validate(Object object) {
        Validate validate = validateAnnotationFrom(object).orElse(null);

        if(validate != null) {
            Map<Object, List<Method>> testMap = testMap(validate, object.getClass());

            for(Object test : testMap.keySet()){
                for(Method m : testMap.get(test)){
                    m.setAccessible(true);
                    try {
                        m.invoke(test,object);
                    }catch (InvocationTargetException e){
                        if(e.getCause().getClass().equals(ValidateNotPassedException.class)) {
                            throw e.getCause();
                        }else throw new RuntimeException("Test " + m.getName() + " is incorrect");
                    }
                }
            }
        }
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

    @SneakyThrows
    private static Map<Object, List<Method>> testMap(Validate validateAnnotation, Class<?> objectClass) {
        Map<Object, List<Method>> res = new HashMap<>();

        for(Class<?> clazz : validateAnnotation.value()){
            try{
                Object testObj =  clazz.getConstructor().newInstance();
                List<Method> methods = Arrays.stream(clazz.getDeclaredMethods())
                        .filter(m -> m.getParameterTypes().length == 1
                                && m.getParameterTypes()[0].equals(objectClass))
                        .toList();
                res.put(testObj, methods);
            }catch (NoSuchMethodException e) {
                throw new RuntimeException(clazz.getName() + " must have a no-arg constructor");
            }
        }

        return res;
    }
}
