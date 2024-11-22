package ru.shumilin.karate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.shumilin.karate.punches.Punchable;

import java.util.List;

@Getter
@AllArgsConstructor
public class Combination implements Punchable {
    String name;
    List<Punchable> punches;

    @Override
    public void make(KarateFighter karateFighter){
        for (Punchable punchable : punches){
            punchable.make(karateFighter);
        }
    }
}
