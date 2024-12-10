package ru.shumilin.stream;

public interface Action<T> {
    void apply(DataStream<T> dataStream);
}
