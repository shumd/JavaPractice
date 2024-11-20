package ru.shumilin.cities;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Way {
    private final City cityTo;
    private int price;

    public Way(Way way){
        this(way.cityTo, way.price);
    }

    public Way(City cityTo, int price) {
        this.cityTo = cityTo;
        setPrice(price);
    }

    public void setPrice(int price){
        if(price < 0){
            throw new IllegalArgumentException();
        }

        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Way way = (Way) o;
        return price == way.price && cityTo == way.cityTo;
    }

    @Override
    public int hashCode() {
        return cityTo.getName().length()*31 + price;
    }

    @Override
    public String toString() {
        return cityTo.getName() + ":" + price;
    }
}
