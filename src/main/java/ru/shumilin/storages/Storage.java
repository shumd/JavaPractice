package ru.shumilin.storages;

import lombok.Setter;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;


public class Storage <T>{
    Supplier<T> supplier;

    private final static Storage EMPTY_STORAGE = new Storage(null);

    T obj;

    public static <V> Storage<V> ofNullable(V value){
        if(value == null) return EMPTY_STORAGE;

        return new Storage<>(value);
    }

    public static <V> Storage<V> of(V value){
        Objects.requireNonNull(value, "Values must not be null");
        return new Storage<>(value);
    }
    public static <V> Storage<V> of(Supplier<V> supplier){
        Storage<V> tmp = new Storage<>(null);
        tmp.supplier = supplier;
        return tmp;
    }

    private Storage(T obj){
        this.obj = obj;
    }

    public T getObject(T alt){
        return supplier.get();
        //        return obj == null ? alt : obj;
    }

    public static <V> Storage<V> empty(){
        return EMPTY_STORAGE;
    }


}
