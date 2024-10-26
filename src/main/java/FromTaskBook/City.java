package FromTaskBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
    private String name;
    private List<Way> ways = new ArrayList<>();

    public City(String name, Way... ways){
        this.name = name;
        for (Way w : ways) {
            addWay(w);
        }
    }

    public String getName() {
        return name;
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
