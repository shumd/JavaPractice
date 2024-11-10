package ru.shumilin.geometry.lines.properties.date;

import ru.shumilin.geometry.lines.properties.Property;

public class DateOfCreationProperty extends Property {
    public DateOfCreationProperty(int hour, int minute){
        super("DateOfCreation", new Date(hour,minute));
    }

    @Override
    public Date getValue() {
        return (Date) value;
    }

    @Override
    public String toString() {
        return "в " + value;
    }
}
