package ru.shumilin.weapons.pistols;

import ru.shumilin.weapons.Weapon;

public class PistolInheritance extends Weapon {
    private final int magazineSize;

    public PistolInheritance(int magazineSize){
        this(0, magazineSize);
    }

    public PistolInheritance(int ammo, int magazineSize){
        super(ammo);
        this.magazineSize = magazineSize;
    }

    public int disCharge(){
        int res = ammo;
        ammo = 0;
        return res;
    }

    @Override
    public int load(int amount){
        if (amount < 0){
            throw new IllegalArgumentException("Amount must be > 0");
        }

        if(amount > magazineSize){
            super.load(magazineSize);
            return amount-magazineSize;
        }
        super.load(amount);
        return 0;
    }

    @Override
    public void shoot(){
        if(getAmmo()){
            System.out.println("Бах!");
        }else {
            System.out.println("Клац!");
        }
    }
}
