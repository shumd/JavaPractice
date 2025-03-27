package ru.shumilin.spring.streamingPlatform;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;
import java.util.function.Supplier;

@Data
@Component
public class Start <S,C> {
    private Supplier<S> objToRead;
    private Consumer<C> objToWrite;
}