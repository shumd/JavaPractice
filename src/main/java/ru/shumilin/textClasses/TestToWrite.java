package ru.shumilin.textClasses;

import lombok.ToString;

@ToString
public class TestToWrite {
    private String name;
    private String value;
    private int amount;

    public TestToWrite(String name, String value){
        this.name = name;
        this.value = value;
    }
}
