package ru.shumilin.annotations;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ToStringTest extends Entity {
    @ToString()
    String name;
    int age;
}
