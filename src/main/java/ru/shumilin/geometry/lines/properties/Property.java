package ru.shumilin.geometry.lines.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Property {
    protected String name;
    protected Object value;

//    public <T> T getValue() {
//        return (T) value;
//    }
}


