package ru.shumilin.spring.trafficLight.color;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import ru.shumilin.spring.trafficLight.TrafficLight;

@Component
public class Red implements Color {
    private ApplicationContext ctx;

    @Autowired
    public void setApplicationContext(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public String getColor() {
        return "red";
    }

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setColor(ctx.getBean(Yellow.class));
    }
}
