package ru.shumilin.tests;

public class TestNotPassedException extends RuntimeException {
    public TestNotPassedException(String message) {
        super(message);
    }

}
