package ru.shumilin.karate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class KarateFighter {
    final String name;

    public void punchFist(){
        System.out.println(name + ": бац!");
    }
    public void punchLeg(){
        System.out.println(name + ": кия!");
    }
    public void punchJump(){
        System.out.println(name + ": вжух!");
    }
}
