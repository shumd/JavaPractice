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

        Line l1 = lineSummator.sum(); // Метод каждый раз возвращает новый Line
        Line l2 = lineSummator.sum();

        Assertions.assertSame(l1, l2);
    }

    @Test
    @DisplayName("Прокси кэширует только методы помеченные аннотацией Cache")
    public void test2(){
        // Создаем новую реализацию интерфейса без аннотации
        Summarable<Line> lineSummator = CacheProxyCreator.
                create(new LineSummatorWithoutAnnotation(new Line(1,2),
                        new Line(2,2)));
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

    @Test
    @DisplayName("Смена аргументов не сбрасывает кэш")
    public void test4(){

    }

    @Test
    @DisplayName("Проверка на null объект")
    public void test5(){

    }

    @Test
    @DisplayName("Проброс exception")
    public void test6(){

    }

    @Test
    @DisplayName("Результат метода с кэшом очевидный")
    public void test7(){

    }
}
