package ru.shumilin.calculator.outputs;

import ru.shumilin.calculator.Printable;

@FunctionalInterface
public interface Output {
    void print(Printable printable);
}
