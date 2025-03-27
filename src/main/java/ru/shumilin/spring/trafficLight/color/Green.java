package ru.shumilin.spring.trafficLight.color;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.shumilin.spring.trafficLight.TrafficLight;

@Component
@RequiredArgsConstructor
@Lazy
public class Green implements Color {
    private Color next;

    @Override
    public String getColor() {
        return "green";
    }

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setColor(yellow);
    }
}
