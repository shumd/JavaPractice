package ru.shumilin.cities.traficLights.colors;

import ru.shumilin.cities.traficLights.TrafficLightClass;

public interface Color {
    void next(TrafficLightClass trafficLight);
    String getColor();
}
