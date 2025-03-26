package ru.shumilin.spring.trafficLight.color;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import ru.shumilin.spring.trafficLight.TrafficLight;

@Component
public class Yellow implements Color {
    private ApplicationContext ctx;
    private boolean isPreviousRed;

    @Autowired
    public void setApplicationContext(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @PostConstruct
    public void init() {
        isPreviousRed = ctx.getBean(TrafficLight.class)
                .getColor()
                .equals(ctx.getBean(Red.class));
    }

    @Override
    public String getColor() {
        return "yellow";
    }

    @Override
    public void next(TrafficLight trafficLight) {
        if (isPreviousRed) {
            trafficLight.setColor(ctx.getBean(Green.class));
            isPreviousRed = false;
        }else {
            trafficLight.setColor(ctx.getBean(Red.class));
            isPreviousRed = true;
        }
    }
}
