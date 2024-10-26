package FromTaskBook;

public class Parrot extends Bird{
    public Parrot(String song) {
        super(song);
    }

    private int random(String song){
        return (int)(Math.random()*(song.length()-1) + 1);
    }

    @Override
    public void sing() {
        System.out.println(getSong().substring(0,random(getSong())));
    }
}
