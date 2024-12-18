package ru.shumilin.exchange;


public class Printer implements Checkable{
    public static Printer of(Share... shares){
        Printer tmp = new Printer();
        for(Share s : shares){
            s.addCheckable(tmp);
        }

        return tmp;
    }

    private Printer(){}

    @Override
    public void check(Share share) {
        System.out.println(share.getName() + " - " + share.getPrice());
    }
}
