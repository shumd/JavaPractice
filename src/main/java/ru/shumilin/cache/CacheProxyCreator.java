package ru.shumilin.cache;

import java.lang.reflect.Proxy;

public class CacheProxyCreator {
    @SuppressWarnings("unchecked")
    public static <T> T create(T o) {
        return (T) Proxy.newProxyInstance(o.getClass().getClassLoader(),
                o.getClass().getInterfaces(),
                new CacheProxyHandler(o));
    }
}
