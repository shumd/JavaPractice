package ru.shumilin.spring.trafficLight.color;


import ru.shumilin.spring.trafficLight.TrafficLight;

public interface Color {
    String getColor();
    void next(TrafficLight trafficLight);
}
