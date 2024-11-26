package ru.shumilin.storages;

public class Box <T>{
    T item;

    public boolean isEmpty(){
        return item==null;
    }

    public T getItem(){
        T tmp = item;
        item = null;
        return tmp;
    }

    public void setItem(T item) {
        if(isEmpty()){
            this.item = item;
        }else throw new RuntimeException();

    }
}
