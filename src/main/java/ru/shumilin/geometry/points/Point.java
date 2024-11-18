package ru.shumilin.geometry.points;

import lombok.EqualsAndHashCode;
import lombok.SneakyThrows;


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