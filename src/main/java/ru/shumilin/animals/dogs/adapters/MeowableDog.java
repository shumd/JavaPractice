package ru.shumilin.animals.dogs.adapters;

import lombok.AllArgsConstructor;
import ru.shumilin.animals.cats.Meowable;
import ru.shumilin.animals.dogs.Dog;

@AllArgsConstructor
public class MeowableDog implements Meowable {
    Dog dog;

    @Override
    public void meow() {
        dog.gav();
    }
}
