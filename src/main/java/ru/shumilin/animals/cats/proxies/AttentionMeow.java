package ru.shumilin.animals.cats.proxies;

import lombok.AllArgsConstructor;
import ru.shumilin.animals.cats.Meowable;

@AllArgsConstructor
public class AttentionMeow implements Meowable {
    Meowable meowable;

    @Override
    public void meow() {
        System.out.print("Attention! ");
        meowable.meow();
    }
}
