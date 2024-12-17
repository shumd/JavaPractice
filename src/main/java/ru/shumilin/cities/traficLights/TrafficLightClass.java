package ru.shumilin.cities.traficLights;

import lombok.Getter;
import lombok.Setter;
import ru.shumilin.cities.traficLights.colors.Color;

@Getter @Setter
public class TrafficLightClass {
    private Color color = ListState.GREEN;

    public void next(){
        color.next(this);
        System.out.println(color.getColor());
    }
}
