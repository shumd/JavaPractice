package ru.shumilin.cities.traficLights.colors;

import ru.shumilin.cities.traficLights.TrafficLightClass;

public class Yellow implements Color{
    private final static String COLOR = "yellow";

    @Override
    public void next(TrafficLightClass trafficLight) {
        if(trafficLight.getColor().getColor().equals("red")) trafficLight.setColor(new Green());
        if(trafficLight.getColor().getColor().equals("green")) trafficLight.setColor(new Red());
    }

    @Override
    public String getColor() {
        return COLOR;
    }
}
