package ru.shumilin.cities.traficLights.colors;

import ru.shumilin.cities.traficLights.TrafficLightClass;

public class Green implements Color{
    private final static String COLOR = "green";

    @Override
    public void next(TrafficLightClass trafficLight) {
        trafficLight.setColor(new Yellow());
    }

    @Override
    public String getColor() {
        return COLOR;
    }
}
