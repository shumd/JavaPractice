package ru.shumilin.exchange;

import ru.shumilin.annotations.Two;

@Two(first = "Test", second = 123)
public class Bot implements Checkable{
    private int purchasePrice;

    public static Bot of(Share share, int purchasePrice) {
        Bot tmp = new Bot();
        tmp.purchasePrice = purchasePrice;

        share.addCheckable(tmp);

        return tmp;
    }

    private Bot(){}

    @Override
    public void check(Share share) {
        if(share.getPrice() < purchasePrice){
            System.out.println("Надо покупать " + share.getName());
        }
    }
}
