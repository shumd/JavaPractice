package ru.shumilin.cities;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(exclude = {"name"})
public class City {
    @Getter
    private final String name;
    private final List<Way> ways = new ArrayList<>();

    public City(String name, Way... ways){
        this.name = name;
        for (Way w : ways) {
            addWay(w);
        }
    }

    public List<Way> getWays() {
        return new ArrayList<>(ways);
    }

    public void addWay(Way way){
        for(Way w : ways){
            if (way.getCityTo() == w.getCityTo()){
                w.setPrice(way.getPrice());
                return;
            }
        }

        ways.add(way);
    }

    public void removeWay(Way way){
        for(Way w : ways){
            if(way.getCityTo() == w.getCityTo()){
                ways.remove(w);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return name + ": " + ways;
    }
}
