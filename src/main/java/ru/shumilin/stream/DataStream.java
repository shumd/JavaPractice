package ru.shumilin.stream;

import java.util.*;
import java.util.function.*;

public class DataStream<T> {
    private final List<T> in;
    private final List<Function<T,?>> actions = new ArrayList<>();

    public static <T> DataStream<T> of(List<T> lst){
        return new DataStream<>(lst);
    }

    private DataStream(List<T> lst){
        in = lst;
    }

    @SuppressWarnings("unchecked")
    public <R> DataStream<R> map(Function<T,R> function){
        actions.add((x)->map(x,function));

        return (DataStream<R>) this;
    }
    private <R> R map(T x, Function<T, R> function){
        return function.apply(x);
    }

    public DataStream<T> filter(Predicate<T> predicate){
        actions.add(x->filter(x,predicate));

        return this;
    }
    private T filter(T x,Predicate<T> predicate){
        return predicate.test(x) ? x:null;
    }

    @SuppressWarnings("unchecked")
    public Optional<T> reduce(BinaryOperator<T> op){
        if (actions.isEmpty()) return Optional.empty();

        Object result = null;
        for(T x : in){
            Object tmp = x;

            for(Function<T,?> action : actions){
                Function<Object,Object> func = (Function<Object, Object>) action;
                tmp = func.apply(tmp);
                if(tmp == null) break;
            }
            if(tmp == null) continue;

            if(result == null){
                result = tmp;
            }else {
                result = op.apply((T) result, (T) tmp);
            }
        }

        actions.clear();
        if (result == null) return Optional.empty();
        return Optional.of((T)result);
    }

    @SuppressWarnings("unchecked")
    public <P> P collect(Supplier<P> supplier, BiConsumer<P, T> consumer){
        P res = supplier.get();
        for(T el : in){
            Object tmp = el;

            for(Function<T,?> action : actions){
                Function<Object,Object> func = (Function<Object, Object>) action;
                tmp = func.apply(tmp);
                if(tmp == null) break;
            }
            if(tmp == null) continue;

            consumer.accept(res, (T)tmp);
        }

        actions.clear();
        return res;
    }
}
