package ru.shumilin.spring.trafficLight.color;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.shumilin.spring.trafficLight.TrafficLight;

@Component
@Lazy
public class Red implements Color {
    private Color next;

    @Override
    public String getColor() {
        return "red";
    }

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setColor(yellow);
    }
}
