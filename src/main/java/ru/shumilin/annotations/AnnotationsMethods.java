package ru.shumilin.annotations;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
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
}
