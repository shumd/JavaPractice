package ru.shumilin.cities.traficLights.colors;

import ru.shumilin.cities.traficLights.TrafficLightClass;

public class Red implements Color{
    private final static String COLOR = "red";

    @Override
    public void next(TrafficLightClass trafficLight) {
        trafficLight.setColor(new Yellow());
    }

    @Override
    public String getColor() {
        return COLOR;
    }
}
