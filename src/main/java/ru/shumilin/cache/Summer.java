package ru.shumilin.cache;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Summer implements Summerable{
    private int x,y;

    @Override @Cache
    public int sum(){
        System.out.println("summing");
        return x+y;
    }
}
