package annotations.cache;

import lombok.AllArgsConstructor;
import ru.shumilin.annotations.Cache;
import ru.shumilin.annotations.Mutator;

@AllArgsConstructor
public class LineSummator implements Summarable<Line> {
    Line l1,l2;

    @Cache
    public Line sum() {
        return new Line(l1.x + l2.x, l1.y + l2.y );
    }

    @Mutator
    public void mutate(){}

    @Cache
    public Line add(){
        return new Line()
    }
}
