package ru.shumilin.spring.trafficLight.color;


import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.shumilin.spring.trafficLight.TrafficLight;

@Component
@RequiredArgsConstructor
@Data
public class Yellow implements Color {
    private final Red red;
    private final Green green;
    private boolean isPreviousRed;

    @PostConstruct
    public void init(){
        red.setNext(this);
        green.setNext(this);
    }

    @Override
    public String getColor() {
        return "yellow";
    }

    @Override
    public void next(TrafficLight trafficLight) {
        if (isPreviousRed) {
            trafficLight.setNextColor(green);
            isPreviousRed = false;
        }else {
            trafficLight.setNextColor(red);
            isPreviousRed = true;
        }
    }
}
