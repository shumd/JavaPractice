package ru.shumilin.calculator.outputs;

import ru.shumilin.calculator.Printable;

public class ConsoleOutput implements Output{
    @Override
    public void print(Printable printable) {
        System.out.println(printable.print());
    }
}
