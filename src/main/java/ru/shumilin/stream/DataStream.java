package ru.shumilin.stream;

import java.util.*;
import java.util.function.*;

public class DataStream<T> {
    private final List<T> in;
    private final List<Action<T>> actions = new ArrayList<>();

    public static <T> DataStream<T> of(List<T> lst){
        return new DataStream<>(lst);
    }

    private DataStream(List<T> lst){
        in = lst;
    }

    public <R> DataStream<R> map(Function<T,R> function){
        actions.add(x->map(function));

        List<R> res = new ArrayList<>();
        for(T x : in){
            res.add(function.apply(x));
        }

        return of(res);
    }

    public DataStream<T> filter(Predicate<T> predicate){
        actions.add(x->x.filter(predicate));

        List<T> res = new ArrayList<>();
        for(T x : in){
            if(predicate.test(x)) res.add(x);
        }

        return of(res);
    }

    public Optional<T> reduce(BinaryOperator<T> op){
        if(in.isEmpty()) return Optional.empty();

        T res = in.getFirst();
        for(T x : in.subList(1, in.size())){
            res = op.apply(res, x);
        }

        return Optional.of(res);
    }

    public <P> P collect(Supplier<P> supplier, BiConsumer<P, T> consumer){
        P res = supplier.get();
        for(T el : in){
            consumer.accept(res, el);
        }

        return res;
    }
}
