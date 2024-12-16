package ru.shumilin.animals.cats.proxies;

import lombok.Getter;
import ru.shumilin.animals.cats.Meowable;

public class MeowCounter implements Meowable {
    Meowable meowable;
    @Getter
    int counter;

    public MeowCounter(Meowable meowable){
        this.meowable = meowable;
    }

    @Override
    public void meow() {
        counter++;
        meowable.meow();
    }
}
