package FromTaskBook;

public abstract class Bird {
    private String song;

    public Bird(String song) {
        this.song = song;
    }

    public void sing(){
        System.out.println(song);
    }

    public String getSong(){
        return song;
    }
}
