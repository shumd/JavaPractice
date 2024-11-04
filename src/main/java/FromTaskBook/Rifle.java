package FromTaskBook;

public class Rifle extends Weapon{
    private final static int DEFAULT_RAPIDITY = 30;
    private final static int DEFAULT_MAGAZINE_SIZE = 30;
    private final int rapidity;
    private final int magazineSize;

    public Rifle() {
        this(DEFAULT_MAGAZINE_SIZE);
    }

    public Rifle(int magazineSize) {
        this(magazineSize, DEFAULT_RAPIDITY);
    }

    public Rifle(int magazineSize, int rapidity) {
        super(magazineSize);
        this.magazineSize = magazineSize;
        if(rapidity > 0){
            this.rapidity = rapidity;
        }else {
            throw new IllegalArgumentException("Rapidity must be greater than 0");
        }
    }

    public int disCharge(){
        int res = ammo();

        while(ammo() != 0){
            getAmmo();
        }
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
    public void shoot() {
        shoot(1);
    }
    public void shoot(int seconds){
        for(int i = 1; i != rapidity*seconds; i++){
            if(getAmmo()){
                System.out.println("Бах!");
            }else {
                System.out.println("Клац!");
            }
        }
    }
}
