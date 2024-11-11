package ru.shumilin.calculator;

import ru.shumilin.calculator.readables.Readable;

import java.util.List;

public class Input<T> implements ru.shumilin.calculator.readables.Readable<T> {
    private final List<T> inputList;

    public Input(Readable<T> readable) {
        this.inputList = readable.read();
    }

    @Override
    public List<T> read(){
        return List.copyOf(inputList);
    }
}
