package ru.shumilin.other;

public enum Temperature {
    HOT("Жарко", 25, 60),
    NORMAL("Нормально", 10, 25),
    LOW("Холодно", -50, 10);

    private String name;
    private int min, max;

    Temperature(String name, int min, int max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return name + " от " + min + " до " + max;
    }
}
