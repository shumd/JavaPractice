package ru.shumilin.university.graduationSystems;

import lombok.Getter;

@Getter
public abstract class GraduationSystem {
    protected final int minMark;
    protected final int maxMark;

    GraduationSystem(int minMark, int maxMark){
        this.minMark = minMark;
        this.maxMark = maxMark;
    }
}
