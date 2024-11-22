package ru.shumilin.karate.punches;

import ru.shumilin.karate.KarateFighter;

public class FistPunch implements Punchable{
    private final static FistPunch FIST_PUNCH = new FistPunch();
    private FistPunch(){}

    public static FistPunch createObject(){
        return FIST_PUNCH;
    }

    @Override
    public void make(KarateFighter karateFighter) {
        karateFighter.punchFist();
    }
}
