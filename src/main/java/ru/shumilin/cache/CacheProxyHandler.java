package ru.shumilin.cache;

import lombok.SneakyThrows;
import ru.shumilin.annotations.Cache;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheProxyHandler implements InvocationHandler {
    private Object obj;
    private Map<Method, Object> cacheMap = new HashMap<>();
    private Map<Field, Object> fieldState = new HashMap<>();

    public CacheProxyHandler(Object obj) {
        this.obj = obj;
    }

    @SneakyThrows
    public boolean hasChanged(){
        for(Field field : obj.getClass().getFields()){
            if(!fieldState.get(field).equals(field.get(obj)))
                return true;
        }

        return false;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        method = obj.getClass().getMethod(method.getName());
        if(!method.isAnnotationPresent(Cache.class) ||
                (method.getAnnotation(Cache.class).value().length != 0 && !List.of(method.getAnnotation(Cache.class).value()).contains(method.getName())))
            return method.invoke(this.obj,objects);
        if(!cacheMap.containsKey(method)){
            cacheMap.put(method,method.invoke(obj,objects));
        }

        return cacheMap.get(method);
    }
}
