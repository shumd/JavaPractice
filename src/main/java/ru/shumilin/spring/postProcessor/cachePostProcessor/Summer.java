package ru.shumilin.spring.postProcessor.cachePostProcessor;

import org.springframework.stereotype.Component;
import ru.shumilin.annotations.Cache;

@Component
public class Summer implements Summerable {
    int x = 5;
    int y = 2;

    @Override
    @Cache
    public int sum() {
        System.out.println("Summing");
        return x+y;
    }
}
