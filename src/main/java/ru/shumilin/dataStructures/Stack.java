package ru.shumilin.dataStructures;

public class Stack <T>{
    private final Object[] array;
    private int top;

    public Stack(int size) {
        array = new Object[size];
    }

    public void push(T item) {
        if(top == array.length) throw new RuntimeException("Stack is full");
        array[top++] = item;
    }
    public T pop() {
        if(isEmpty()) throw new RuntimeException("Stack is empty");
        return (T) array[--top];
    }
    public T peek() {
        if(isEmpty()) throw new RuntimeException("Stack is empty");
        return (T) array[top-1];
    }

    private boolean isEmpty() {
        return top == 0;
    }
}
