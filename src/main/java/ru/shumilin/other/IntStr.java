package ru.shumilin.other;

public class IntStr extends Number {
    private String str;
    public IntStr(String str) {
        this.str = str;
    }

    @Override
    public int intValue() {
        return str.length();
    }

    @Override
    public long longValue() {
        return str.length();
    }

    @Override
    public float floatValue() {
        return str.length();
    }

    @Override
    public double doubleValue() {
        return str.length();
    }
}
