package ru.shumilin.geometry.lines.properties;


import java.util.ArrayList;
import java.util.List;

public class CoordinatesProperty extends Property {
    public CoordinatesProperty(List<Integer> coordinates) {
        super("Coordinates", coordinates);
    }

    public CoordinatesProperty(Integer... coordinates) {
        this(List.of(coordinates));
    }

    @Override
    public List<Integer> getValue() {
        return new ArrayList<>((List<Integer>) value);
    }

    @Override
    public String toString() {
        return getValue().toString();
    }
}
