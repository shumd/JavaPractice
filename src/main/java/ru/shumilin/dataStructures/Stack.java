package ru.shumilin.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class Stack <T>{
    private final List<T> array;
    private int top;

    public Stack(int size) {
        array = new ArrayList<>();
    }

    public void push(T item) {
        if(top == array.size()) throw new RuntimeException("Stack is full");
        array.set(top++, item);
    }
    public T pop() {
        if(isEmpty()) throw new RuntimeException("Stack is empty");
        return (T) array.get(--top);
    }
    public T peek() {
        if(isEmpty()) throw new RuntimeException("Stack is empty");
        return (T) array.get(top-1);
    }

    private boolean isEmpty() {
        return top == 0;
    }
}
