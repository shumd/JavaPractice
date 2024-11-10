package ru.shumilin.calculator;

import java.util.List;

public class Input<T> implements Readable<T>{
    private final List<T> inputList;

    public Input(Readable<T> readable) {
        this.inputList = readable.read();
    }

    @Override
    public List<T> read(){
        return List.copyOf(inputList);
    }
}
