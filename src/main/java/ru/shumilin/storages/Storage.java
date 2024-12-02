package ru.shumilin.storages;

public class Storage <T>{
    private final static Storage EMPTY_STORAGE = new Storage(null);

    T obj;

    private Storage(T obj){
        this.obj = obj;
    }

    public T getObject(T alt){
        return obj == null ? alt : obj;
    }

    public static <V> Storage<V> empty(){
        return EMPTY_STORAGE;
    }

    public static <V> Storage<V> of(V value){
        if(value == null) return EMPTY_STORAGE;

        return new Storage<>(value);
    }
}
