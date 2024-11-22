package ru.shumilin.karate.punches;

import ru.shumilin.karate.KarateFighter;

@FunctionalInterface
public interface Punchable {
    void make(KarateFighter karateFighter);
}
