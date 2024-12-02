package ru.shumilin.university;

import lombok.Getter;

@Getter
public class IllegalMarkException extends RuntimeException {
    private int wrongMark;

    public IllegalMarkException(int wrongMark) {
        super("Mark "+ wrongMark +" is illegal");
        this.wrongMark = wrongMark;
    }
    public IllegalMarkException(String message){
        super(message);
    }
    public IllegalMarkException(){super();}
}