package ru.shumilin.university.graduationSystems;

import lombok.Getter;

@Getter
public abstract class GraduationSystem {
    protected int minMark;
    protected  int maxMark;

    public GraduationSystem(int minMark, int maxMark){
        this.minMark = minMark;
        this.maxMark = maxMark;
    }
}
