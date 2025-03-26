package ru.shumilin.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Review {
    private String text;
    private int rating;
}
