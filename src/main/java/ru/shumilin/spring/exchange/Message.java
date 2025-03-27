package ru.shumilin.spring.exchange;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.shumilin.exchange.Checkable;
import ru.shumilin.exchange.Share;

import java.util.function.Predicate;
import java.util.function.Supplier;

@AllArgsConstructor
@Data
@Builder
public class Message implements Checkable {
    private Share share;
    private int purchasePrice;
    private Supplier<String> messageSupplier;
    private Predicate<Share> predicate;

    @PostConstruct
    public void init(){
        share.addCheckable(this);
    }

    @Override
    public void check(Share share) {
        if(predicate.test(share)) {
            System.out.println(messageSupplier.get());
        }
    }
}