package FromTaskBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosedPolyline extends Polyline {
    public ClosedPolyline(Point... args){
        this(new ArrayList<>(Arrays.asList(args)));
    }
    public ClosedPolyline(){
        this(new ArrayList<>());
    }
    public ClosedPolyline(List<Point> points){
        super(points);
    }

    @Override
    public int length() {
        List<Point> points = getPoints();

        if(points.size() <= 2){
            return super.length();
        }

        return super.length() +
                new Line(points.getLast().x, points.getLast().y,
                        points.getFirst().x, points.getFirst().y).
                        lenght();
    }
}
