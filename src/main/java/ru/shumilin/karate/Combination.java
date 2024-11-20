package ru.shumilin.karate;

import lombok.Getter;

import java.util.HashMap;

@Getter
public class Combination {
    HashMap<Integer,Punchable> combination;

    public Combination(HashMap<Integer,Punchable> combination) {
        this.combination = combination;
    }

    public void addPunch(Integer key, Punchable punchable) {
        combination.put(key, punchable);
    }
    public void removePunch(Integer key) {
        combination.remove(key);
    }
}
