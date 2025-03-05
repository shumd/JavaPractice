package ru.shumilin.geometry.points;

import lombok.EqualsAndHashCode;
import lombok.SneakyThrows;
import lombok.ToString;

@ToString
@EqualsAndHashCode()
public class Point implements Comparable<Point>, Cloneable {
    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this(point.x, point.y);
    }

    public int distanceTo(Point to){
        return (int)Math.sqrt(Math.pow(to.x - x,2) + Math.pow(to.y - y,2));
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

    @Override @SneakyThrows
    public Point clone() {
        return (Point) super.clone();
    }
}
