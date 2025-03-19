package ru.shumilin.cache;

import ru.shumilin.annotations.Cache;
import ru.shumilin.annotations.Mutator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheProxyHandler implements InvocationHandler {
    private Map<Key, Object> cacheMap = new HashMap<>();

    private Object obj;

    public CacheProxyHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method = proxy.getClass().getMethod(method.getName(), method.getParameterTypes());

        if(method.isAnnotationPresent(Mutator.class)){
            cacheMap.clear();
        }

        if(!method.isAnnotationPresent(Cache.class)){
            return method.invoke(obj, args);
        }

        Key key = new Key(method, args);
        if(cacheMap.containsKey(key)){
            return cacheMap.get(key);
        }

        Object o = method.invoke(obj, args);
        cacheMap.put(key, o);
        return o;
    }
}

record Key(Method m, Object[] args) {}