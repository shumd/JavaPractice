package ru.shumilin.spring.streamingPlatform;

public interface Readable<T> {
    public void read(T obj);
}
