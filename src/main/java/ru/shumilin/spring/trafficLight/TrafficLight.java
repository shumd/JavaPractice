package ru.shumilin.spring.trafficLight;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.shumilin.spring.trafficLight.color.Color;


@Component
@Data
@Lazy
public class TrafficLight {
    private Color nextColor;

    @Autowired
    public void setStartColor(@Qualifier("yellow") Color startColor) {
        this.nextColor = startColor;
    }

    public void next(){
        nextColor.next(this);
        System.out.println(nextColor.getColor());
    }
}
