package ru.shumilin.karate;

import lombok.Getter;

public class KarateFighter {
    @Getter
    final String name;
    Combination combination;

    public KarateFighter(String name, Combination combination) {
        this.name = name;
        this.combination = combination;
    }

    public void doCombination(int... combination) {
        for (int n : combination) {
            System.out.println(name + ": " +
            this.combination.
                    getCombination().
                    get(n).punch());
        }
    }
    public void doCombination(){
        doCombination(combination.getCombination().
                keySet().
                stream().mapToInt(i -> i).toArray());
    }
}
