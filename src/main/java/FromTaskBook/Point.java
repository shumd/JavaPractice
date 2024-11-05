package FromTaskBook;

import lombok.EqualsAndHashCode;

import java.util.Comparator;

@EqualsAndHashCode
public class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this(point.x, point.y);
    }

    @Override
    public String toString() {
        return ("{" + x + ";" + y + "}");
    }

    @Override
    public int compareTo(Point point) {
        if(x == point.x){
            return y-point.y;
        }
        return x-point.x;
    }
}
