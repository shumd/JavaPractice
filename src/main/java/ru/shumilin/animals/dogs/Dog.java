package ru.shumilin.animals.dogs;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dog implements Gavable{
    String name;

    public void gav(){
        System.out.println(name +": baw waw");
    }
}
