package ru.shumilin.weapons.pistols;

import lombok.Getter;

public class Pistol {
    @Getter
    private int ammo;
    private final int magazineSize;


    public Pistol(int magazineSize){
        this(0, magazineSize);
    }

    public Pistol(int ammo, int magazineSize){
        if(magazineSize < 1){
            throw new IllegalArgumentException("Magazine size must be > 0");
        }

        this.ammo = ammo;
        this.magazineSize = magazineSize;
    }

    public boolean isEmpty(){
        return ammo == 0;
    }

    public int reload(int amount){
        if (amount < 0){
            throw new IllegalArgumentException("Amount must be > 0");
        }

        if(amount > magazineSize){
            ammo = magazineSize;
            return amount-magazineSize;
        }

        ammo += amount;

        return 0;
    }

    public int disCharge(){
        int res = ammo;
        ammo = 0;
        return res;
    }

    public void shot(){
        if(ammo > 0){
            System.out.println("Бах!");
            ammo--;
        }else {
            System.out.println("Клац!");
        }
    }
}
