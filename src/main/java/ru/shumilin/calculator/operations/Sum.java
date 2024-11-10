package ru.shumilin.calculator.operations;

public class Sum implements Operation{
    @Override
    public Number make(Number x, Number y) {
        return x.doubleValue()+y.doubleValue();
    }
}
