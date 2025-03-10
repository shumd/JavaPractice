package ru.shumilin.annotations;

public class ValidateNotPassedException extends RuntimeException {
    public ValidateNotPassedException(String message) {
        super(message);
    }
}
