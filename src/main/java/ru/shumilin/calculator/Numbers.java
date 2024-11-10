package ru.shumilin.calculator;

import java.util.ArrayList;
import java.util.List;

public class Numbers implements Readable<Number> {
    List<Number> numbers;

    public Numbers(Number... numbers) {
        this.numbers = List.of(numbers);
    }

    @Override
    public List<Number> read() {
        return new ArrayList<>(numbers);
    }
}
