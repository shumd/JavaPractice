package ru.shumilin.cities;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        if (getWays().size() != city.getWays().size()) return false;
        List<Way> otherWays = city.getWays();

        for (Way way : ways) {
            for (int j = 0; j < otherWays.size(); j++) {
                if (way.equals(otherWays.get(j))) {
                    otherWays.remove(j);
                    break;
                }
            }
        }

        return otherWays.isEmpty();
    }

    @Override
    public final int hashCode() {
        int waysHash = 0;

        for(Way way : ways){
            waysHash += way.hashCode();
        }

        return waysHash;
    }

    @Override
    public String toString() {
        return name + ": " + ways;
    }
}
