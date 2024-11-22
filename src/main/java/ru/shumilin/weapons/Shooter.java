package ru.shumilin.weapons;

import lombok.Getter;
import lombok.Setter;

public class Shooter {
    String name;
    @Setter @Getter
    private Weapon weapon;

    public Shooter(String name){
        this.name = name;
    }

    public void shoot(){
        if (weapon == null){
            System.out.println("не могу участвовать в перестрелке");
        }else{
            weapon.shoot();
        }
    }
}
