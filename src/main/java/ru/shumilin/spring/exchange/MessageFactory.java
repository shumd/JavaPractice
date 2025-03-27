package ru.shumilin.spring.exchange;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import ru.shumilin.exchange.Share;

import java.util.function.Predicate;
import java.util.function.Supplier;

@Component
public class MessageFactory {
    private ApplicationContext ctx;

    public Message create(Share share, int purchasePrice,
                          Predicate<Share> predicate, Supplier<String> messageSupplier){
        return Message.builder()
                .share(share)
                .predicate(predicate)
                .purchasePrice(purchasePrice)
                .messageSupplier(messageSupplier)
                .build();
    }
}
