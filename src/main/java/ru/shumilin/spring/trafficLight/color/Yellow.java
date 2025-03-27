package ru.shumilin.spring.trafficLight.color;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.shumilin.spring.trafficLight.TrafficLight;

@Component
@Lazy
public class Yellow implements Color {
    private Color previous;
    private Color next;
    private TrafficLight trafficLight;
    private boolean isPreviousRed = trafficLight.getColor().equals(red);

    @Override
    public String getColor() {
        return "yellow";
    }

    @Override
    public void next(TrafficLight trafficLight) {
        if (isPreviousRed) {
            trafficLight.setColor(green);
            isPreviousRed = false;
        }else {
            trafficLight.setColor(red);
            isPreviousRed = true;
        }
    }
}
