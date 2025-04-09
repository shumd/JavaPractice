//package annotations.cache;
//
//import lombok.AllArgsConstructor;
//import ru.shumilin.annotations.Mutator;
//
//@AllArgsConstructor
//public class LineSummatorWithoutAnnotation implements Summarable<Line>{
//    Line l1, l2;
//
//    @Override
//    public Line sum() {
//        return new Line(l1.x + l2.x, l1.y + l2.y);
//    }
//
//    @Mutator
//    @Override
//    public void mutate() {}
//}
