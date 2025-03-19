package ru.shumilin.cache;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.shumilin.annotations.Cache;

@AllArgsConstructor
@Getter @Setter
public class Summer implements Summerable{
    private int x,y;

    @Override @Cache(value = "sum")
    public int sum(){
        System.out.println("summing");
        return x+y;
    }
}
