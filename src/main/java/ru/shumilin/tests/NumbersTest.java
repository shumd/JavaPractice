package ru.shumilin.tests;

import ru.shumilin.numbers.Fraction;

public class NumbersTest {
    public static void fractionTest(){
        Fraction fraction = Fraction.of(1,2);

        if(fraction.doubleValue() != (double) 1/2) throw new TestNotPassedException("fractionTest not passed");
    }
}
