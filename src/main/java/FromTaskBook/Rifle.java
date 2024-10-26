package FromTaskBook;

public class Rifle extends Pistol{
    private final static int DEFAULT_RAPIDITY = 30;
    private final static int DEFAULT_MAGAZINE_SIZE = 30;
    private final int rapidity;


    public Rifle() {
        this(DEFAULT_MAGAZINE_SIZE);
    }

    public Rifle(int magazineSize) {
        this(magazineSize, DEFAULT_RAPIDITY);
    }

    public Rifle(int magazineSize, int rapidity) {
        super(magazineSize);
        if(rapidity > 0){
            this.rapidity = rapidity;
        }else {
            throw new IllegalArgumentException("Rapidity must be greater than 0");
        }
    }

    @Override
    public void shot() {
        shot(1);
    }
    public void shot(int seconds){
        for(int i = 1; i != rapidity*seconds; i++){
            super.shot();
        }
    }
}
