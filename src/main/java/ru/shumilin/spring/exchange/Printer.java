package ru.shumilin.spring.exchange;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.shumilin.exchange.Share;

@Component
@RequiredArgsConstructor
public class Printer {
    private final MessageFactory messageFactory;

    public void subscribe(Share... shares){
        for(Share s : shares){
            s.addCheckable(
                messageFactory.create(
                        s,0,
                        share -> true,
                        () -> s.getName() + " - " + s.getPrice()
                )
            );
        }
    }
}
