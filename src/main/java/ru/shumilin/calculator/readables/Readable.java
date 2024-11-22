package ru.shumilin.calculator.readables;

import java.util.List;

@FunctionalInterface
public interface Readable<E> {
    List<E> read();
}
