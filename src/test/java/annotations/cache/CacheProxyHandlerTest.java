package annotations.cache;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.shumilin.cache.CacheProxyCreator;


public class CacheProxyHandlerTest {
    @Test
    @DisplayName("Прокси кэширует результаты")
    public void test1(){
        Summarable<Line> lineSummator = CacheProxyCreator.
                create(new LineSummator(new Line(1,2), new Line(2,2)));
        Line l1 = lineSummator.sum();
        Line l2 = lineSummator.sum();

        Assertions.assertSame(l1, l2);
    }

    @Test
    @DisplayName("Прокси кэширует только методы помеченные аннотацией Cache")
    public void test2(){
        Summarable<Line> lineSummator = CacheProxyCreator.
                create(new LineSummatorWithoutAnnotation(new Line(1,2), new Line(2,2)));
        Line l1 = lineSummator.sum();
        Line l2 = lineSummator.sum();

        Assertions.assertNotSame(l1, l2);
    }

    @Test
    @DisplayName("Прокси очищает кэш при вызове метода с аннотацией Mutator")
    public void test3(){
        Summarable<Line> lineSummator = CacheProxyCreator.
                create(new LineSummator(new Line(1,2), new Line(2,2)));

        Line l1 = lineSummator.sum();
        lineSummator.mutate();
        Line l2 = lineSummator.sum();

        Assertions.assertNotSame(l1, l2);
    }
}
