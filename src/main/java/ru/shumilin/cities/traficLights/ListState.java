package ru.shumilin.cities.traficLights;

import ru.shumilin.cities.traficLights.colors.Color;

public enum ListState implements Color{
    GREEN("green"){
        @Override
        public void next(TrafficLightClass trafficLight) {
            trafficLight.setColor(PRE_YELLOW);
        }
    },
    PRE_YELLOW("yellow"){
        @Override
        public void next(TrafficLightClass trafficLight) {
            trafficLight.setColor(RED);
        }
    },
    RED("red"){
        @Override
        public void next(TrafficLightClass trafficLight) {
            trafficLight.setColor(POST_YELLOW);
        }
    },
    POST_YELLOW("yellow"){
        @Override
        public void next(TrafficLightClass trafficLight) {
            trafficLight.setColor(GREEN);
        }
    };

    String color;

    ListState(String color){
        this.color = color;
    }

    @Override
    public abstract void next(TrafficLightClass trafficLight);

    @Override
    public String getColor() {
        return color;
    }
}
