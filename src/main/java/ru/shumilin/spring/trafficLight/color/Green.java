package ru.shumilin.spring.trafficLight.color;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import ru.shumilin.spring.trafficLight.TrafficLight;

@Component
@Qualifier("green")
@RequiredArgsConstructor
public class Green implements Color {
    private  ApplicationContext ctx;

    @Autowired
    public void setApplicationContext(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public String getColor() {
        return "green";
    }

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setColor(ctx.getBean(Yellow.class));
    }
}
