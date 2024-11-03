package FromTaskBook;

public class Cuckoo extends Bird{
    private static final int MIN = 1;
    private static final int MAX = 10;

    public Cuckoo() {
        super("ку-ку");
    }

    private static int random(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    @Override
    public void sing() {
        int counter = 0;
        int amount = random(MIN, MAX);
        for(int i = 0; i < amount; i++) {
            super.sing();
        }
    }
}
