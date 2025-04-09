package ru.shumilin.spring.trafficLight.color;


import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.shumilin.spring.trafficLight.TrafficLight;

@Component
@Lazy
public class Red implements Color {
    private Yellow next;

    public void setNext(Yellow next) {
        this.next = next;
    }

    @Override
    public String getColor() {
        return "red";
    }

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setNextColor(next);
    }
}
