package ru.shumilin.spring.exchange;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.shumilin.exchange.Share;

@Component
@RequiredArgsConstructor
public class Bot {
    private final MessageFactory messageFactory;

    public void subscribe(Share share, int purchasePrice){
            share.addCheckable(
                    messageFactory.create(
                            share,purchasePrice,
                            s -> s.getPrice() <= purchasePrice,
                            () -> "Надо покупать " + share.getName() + " " + share.getPrice()
                    )
            );
    }
}
