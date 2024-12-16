package ru.shumilin.animals.strangeCreatures;

import ru.shumilin.animals.cats.Cat;
import ru.shumilin.animals.cats.Meowable;
import ru.shumilin.animals.dogs.Dog;
import ru.shumilin.animals.dogs.Gavable;

public class CatDog implements Meowable, Gavable {
    private Cat cat;
    private Dog dog;

    public CatDog(String name){
        this.cat = new Cat(name);
        this.dog = new Dog(name);
    }

    public void meow(){
        cat.meow();
    }

    public void gav(){
        dog.gav();
    }
}