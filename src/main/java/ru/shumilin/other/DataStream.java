package ru.shumilin.other;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

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

    public static void main(String[] args) {
        List<String> lst = List.of("asd","sd","sadwr");
        List<Integer> lst2 = map(lst, (x) -> x.length());
        System.out.println(lst2);
    }
}
