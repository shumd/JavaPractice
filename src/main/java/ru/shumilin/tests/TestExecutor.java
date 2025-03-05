package ru.shumilin.tests;


import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class TestExecutor {
    private static final Map<Method, String> results = new HashMap<>();

    public static Map<Method, String> getResults(){
        return new HashMap<>(results);
    }

    @SneakyThrows
    public static void execute(Class<?>... classes){
        for(Class<?> c : classes){
            Method[] methods = c.getDeclaredMethods();
            Object obj = c.getConstructor().newInstance();

            for(Method m : methods){
                try {
                    m.invoke(obj);
                    results.put(m ,m.getName() + " passed");
                }catch (InvocationTargetException e){
                    results.put(m, e.getCause().getMessage());
                }
            }
        }
    }
}
