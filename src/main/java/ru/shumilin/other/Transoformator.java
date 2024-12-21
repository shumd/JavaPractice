package ru.shumilin.other;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Transoformator <R,D> {
    Consumer<D> consumer;
    Function<R, D> function;
    Supplier<R> supplier;

    private Transoformator(Consumer<D> consumer, Function<R, D> function, Supplier<R> supplier) {
        this.consumer = consumer;
        this.function = function;
        this.supplier = supplier;
    }

    public static <T, V> Transoformator<T, V> of(Consumer<V> consumer, Function<T, V> function, Supplier<T> supplier) {
        return new Transoformator<>(consumer, function, supplier);
    }

    public void transform() {
        consumer.accept(
                function.apply(supplier.get())
        );
    }
}