package ru.shumilin.other;

import ru.shumilin.calculator.operations.Operation;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class DataStream {
    public static <T,R> List<R> map(List<T> lst, Function<T,R> function){
        List<R> res = new ArrayList<>();
        for(T x : lst){
            res.add(function.apply(x));
        }
        return res;
    }

    public static <T> List<T> filter(List<T> lst, Predicate<T> predicate){
        List<T> res = new ArrayList<>();
        for(T x : lst){
            if(predicate.test(x)) res.add(x);
        }

        return res;
    }

//    public static <T> T collect(List<T> list, BinaryOperator<T> combiner){
//        if(list.isEmpty()) return null;
//
//        T res = list.getFirst();
//        for(T x : list.subList(1, list.size())){
//            res = combiner.apply(res, x);
//        }
//
//        return res;
//    }

    public static <T> Optional<T> collect(List<T> list, BinaryOperator<T> combiner){
        if(list.isEmpty()) return Optional.empty();

        T res = list.getFirst();
        for(T x : list.subList(1, list.size())){
            res = combiner.apply(res, x);
        }

        return Optional.of(res);
    }

    public static <T,P extends Collection<T>> Collection<T> toCollection(List<T> lst, Supplier<P> creator, Function<T, T> function){
        Collection<T> res = creator.get();

        for(T x : lst){
            res.add(function.apply(x));
        }

        return res;
    }


    public static void main(String[] args) {
        // 6.3.1 Функция
        List<String> lst = List.of("petya","vasya","fedor");
        List<Integer> lst2 = map(lst, String::length);
        System.out.println(lst2);

        String s = collect(lst, (x,y) -> x+y).orElse("");
        System.out.println(s);
    }
}
