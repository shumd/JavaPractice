package ru.shumilin.spring.trafficLight;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import ru.shumilin.spring.trafficLight.color.Color;


@Component
@Data
public class TrafficLight {
    private static final String STARTING_COLOR_BEAN_NAME = "yellow";
    private ApplicationContext ctx;
    private Color color;

    @Autowired
    public void setApplicationContext(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @PostConstruct
    public void init() {
        color = ctx.getBean(STARTING_COLOR_BEAN_NAME, Color.class);
    }

    public void next(){
        color.next(this);
        System.out.println(color.getColor());
    }
}
