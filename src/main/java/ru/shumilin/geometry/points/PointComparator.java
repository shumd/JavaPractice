package ru.shumilin.geometry.points;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {
    @Override
    public int compare(Point point1, Point point2) {
        if(point1.x == point2.x){
            return point1.y-point2.y;
        }
        return point1.x-point2.x;
    }
}
