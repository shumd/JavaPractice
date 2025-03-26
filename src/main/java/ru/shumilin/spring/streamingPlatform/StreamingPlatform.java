package ru.shumilin.spring.streamingPlatform;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;


@AllArgsConstructor
//@Component
public class StreamingPlatform <T>{
    Supplier<T> supplier;
    Readable<T> readable;

    private void use(){

    }
}
