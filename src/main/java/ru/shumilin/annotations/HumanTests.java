package ru.shumilin.annotations;

import ru.shumilin.tests.TestNotPassedException;

public class HumanTests {
    void ageTest(Human human) {
        if (human.age > 200 || human.age < 1) throw new TestNotPassedException("Возраст человека не в диапазоне от 1 до 200");
    }

    void nullTest(Human human){
        Human s = null;
        int a = s.age;
    }
}
