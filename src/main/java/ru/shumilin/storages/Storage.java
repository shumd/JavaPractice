package ru.shumilin.storages;

public class Storage <T>{
    T obj, alt;

    public Storage(T obj, T alt){
        this.obj = obj;
        this.alt = alt;
    }

    public T getObject(){
        return obj == null ? alt : obj;
    }
}
