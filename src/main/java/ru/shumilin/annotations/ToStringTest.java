package ru.shumilin.annotations;

import lombok.AllArgsConstructor;
import ru.shumilin.other.Entity;

@AllArgsConstructor
public class ToStringTest extends Entity {
    @ToString()
    String name;
    int age;
}
