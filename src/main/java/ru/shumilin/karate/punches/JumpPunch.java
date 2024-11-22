package ru.shumilin.karate.punches;

import ru.shumilin.karate.KarateFighter;

public class JumpPunch implements Punchable{
    @Override
    public void make(KarateFighter karateFighter) {
        karateFighter.punchJump();
    }
}
