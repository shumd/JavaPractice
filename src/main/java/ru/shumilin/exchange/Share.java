package ru.shumilin.exchange;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Share {
    private final List<Checkable> checkableList = new ArrayList<>();
    @Getter
    private final String name;
    @Getter
    private int price;

    public Share(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void addCheckable(Checkable checkable) {
        checkableList.add(checkable);
    }

    public void setPrice(int price) {
        for (Checkable checkable : checkableList) {
            checkable.check(this);
        }

        this.price = price;
    }
}
