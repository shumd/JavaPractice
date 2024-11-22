package ru.shumilin.karate.punches;

import ru.shumilin.karate.KarateFighter;

public class LegPunch implements Punchable {
    @Override
    public void make(KarateFighter karateFighter) {
        karateFighter.punchLeg();
    }
}
