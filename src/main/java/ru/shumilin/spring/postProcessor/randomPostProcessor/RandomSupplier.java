package ru.shumilin.spring.postProcessor.randomPostProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier implements Supplier<Integer> {
    private static RandomSupplier INSTANCE;
    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final List<Integer> numbersRange = new ArrayList<>();
    private static final Random random = new Random();

    public static RandomSupplier getInstance(){
        if(INSTANCE == null){
            INSTANCE = new RandomSupplier();
        }
        return INSTANCE;
    }

    private static void fillArray(List<Integer> list, int min, int max){
        for(int i = min; i < max; i++){
            list.add(i);
        }
    }

    @Override
    public Integer get() {
        if(numbersRange.isEmpty()){
            fillArray(numbersRange, MIN, MAX);
        }

        int randomIndex = random.nextInt(0, numbersRange.size());
        int res = numbersRange.get(randomIndex);
        numbersRange.remove(randomIndex);
        return res;
    }
}
